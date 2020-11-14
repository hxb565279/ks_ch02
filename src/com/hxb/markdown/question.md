###Bean的生命周期的整个执行过程描述如下
<ol>
<li>根据配置情况调用Bean构造方法或工厂方法实例化Bean</li>
<li>利用依赖注入来完成Bean中所有属性值的配置注入</li>
<li>如果Bean实现了BeanNameAware接口，则Spring调用Bean的setBeanName()方法传入当前Bean的id值</li>
<li>如果Bean实现了BeanFactoryAware接口，则Spring调用setBeanFactory()方法传入当前工厂实例的引用</li>
<li>如果Bean实现了ApplicationContextAware接口，则Spring调用setApplicationContext()方法传入当前ApplicationContext实例的引用。</li>
<li>如果BeanPostProcessor和Bean关联，则Spring将调用该接口的预初始化方法postProcessBeforeInitialzation()对Bean进行加工操作，这个非常重要，Spring的AOP就是用它实现的。</li>
<li>如果Bean实现了InitializingBean接口，则Spring将调用afterPropertiesSet()方法。</li>
<li>如果在配置文件中通过init-method属性指定了初始化方法，则调用该初始化方法。</li>
<li>如果有BeanPsostProcessor和Bean关联，则Spring将调用该接口的初始化方法postProcessAfterInitialization()。此时，Bean已经可以被应用系统使用了</li>
<li>如果在<bean> 中指定了该Bean的作用范围为 scope="singleton"，则将该Bean 放入Spring IoC的缓存池中，将触发Spring对该Bean的生命周期管理；如果在<bean>中指定了该Bean的作用范围为scope="prototype"，则将该Bean交给调用者，调用者管理该Bean的生命周期，Spring不再管理该Bean。</li>
<li>如果Bean实现了DisposableBean接口，则Spring会调用destory()方法将Spring中的Bean销毁；如果在配置文件中通过destory-method属性指定了Bean的销毁方法，则Spring将调用该方法进行销毁。
</li>
</ol>

###Bean中主要包含三种装配方式，分别为基于XML的装配，基于Annotation的装配和自动装配，这三种装配方式的用法如下：
<ol>
<li>基于XML的装配：Spring提供了2种基于XML的装配方式：设值注入（Setter Injection）和构造注入（Constructor Injection）。设置注入中的Bean类必须提供一个默认的无参构造方法，同时必须为需要注入的属性提供对应的setter方法。使用设值注入时，在Spring配置文件中，需要使用<bean>元素的子元素<property>来为每个属性注入值。使用构造注入时，在配置文件里，需要使用<bean>元素的子元素<constructor-arg>来定义构造方法的参数，可以使用其value属性（或子元素）来设置该参数的值。</li>
<li>基于Annotation的装配：使用基于Annotation的装配时，首先需要使用@Repository、@Service与@Constroller分别对实现类进行标注，然后用@Autowired或@Resource注解对注入的Bean的属性进行标注，最后在Spring的配置文件中，通过<context:annotation-config />来开启注解处理器，或使用<context:component-scan base-package="Bean所在的包路径"/>的配置方式即可实现Annotation的装配。</li>
<li>自动装配：在<bean>元素中使用autowire属性，并将其属性值设置为byName或者byType即可实现自动装配。</li>

</ol>