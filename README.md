# SpringLearn2
再次学习spring

## 概述
Spring是一个分层的JavaSE/EE full-stack(一站式)轻量级开源框架。贯穿表现层，业务层，持久层，解决各层之间的松耦合问题，但是spring并不是取代那些已有框架，而是与他们无缝结合。

## Spring 模块
### Spring core
*	spring管理的java对象，spring称之为bean，并提供工厂生产bean对象
*	使用spring后不再使用new的方式创建bean对象，而是使用工厂getBean()
*	spring直接使用配置的方式为bean赋值

### Spring context
* spring上下文：一个配置文件，向spring提供上下文信息

### Spring IOC
#### IOC 控制反转
*	控制权由应用代码中转到了外部容器，控制权的转移，称之为反转。

	`从之前的new对象，反转由xml中配置，通过spring提供的ioc容器读取xml文件，反射成对象`

#### DI 依赖注入
*	IOC的另外一种表述方式

	`在ioc生成对象的时候，通过对象提前写好的一些set方法，通过调用这些set方法设置一些数值。这个动作就叫做注入。`

#### IOC容器的实现方式
1.	BeanFactory
2.	ApplicationContext    
*	ClassPathXmlApplicationContext 对应类路径下的XML格式的配置文件
*	FileSystemXmlApplicationContext 对应文件系统中的XML格式的配置文件
*	ConfigurableApplicationContext 是ApplicationContext的子接口，包含一些扩展方法
*	WebApplicationContext 专门为WEB应用而准备的，它允许从相对于WEB根目录的路径中完成初始化工作

### Spring AOP
#### 概述
1.	AOP面向切面编程
2.	可以对业务逻辑的各个部分进行隔离，从而使得业务逻辑各部分之间的耦合度降低，提高程序的可重用性，同时提高了开发的效率。

#### 核心概念
1.	横切关注点

	对哪些方法进行拦截，拦截后怎么处理，这些关注点称之为横切关注点
2.	切面（aspect）

	类是对物体特征的抽象，切面就是对横切关注点的抽象
3.	连接点（joinpoint）

	被拦截到的点，因为Spring只支持方法类型的连接点，所以在Spring中连接点指的就是被拦截到的方法，实际上连接点还可以是字段或者构造器
4.	切入点（pointcut）

	对连接点进行拦截的定义
5.	通知（advice）

	所谓通知指的就是指拦截到连接点之后要执行的代码，通知分为前置、后置、异常、最终、环绕通知五类
6.	目标对象

	代理的目标对象
7.	织入（weave）

	将切面应用到目标对象并导致代理对象创建的过程
8.	引入（introduction）

	在不修改代码的前提下，引入可以在运行期为类动态地添加一些方法或字段
	
	
### Spring DAO
* 针对dao层，对jdbc进行了封装，提供了一致的访问数据库的方式

### Spring ORM
* 主要针对数据库orm框架的无缝连接。

### Spring WEB
* spring web使我们的spring可以无缝的和struts联合使用。

### Spring MVC
* 一个独立于spring 的框架,通过策略接口，MVC框架变成为高度可配置的

## Test
### 搭建环境
* spring-context jar包
* aop jar包

### 编写上下文配置文件 applicationContext.xml
#### 引入约束
#### 使用spring创建bean对象
1.	配置类和属性方法
*	通过bean的setX()方法赋值
*	通过bean的构造器赋值
*	p名称空间
*	外部对象
*	级联
*	list,map等集合和数组
*	Properties
*	继承
*	引用外部属性文件

2.	bean的作用域
*	Singleton(默认)  只会存在一个共享的bean实例
*	Prototype 每次对该bean请求时都会创建一个新的bean实例 。
*	request 每一次HTTP请求都会产生一个新的bean，仅适用于WebApplicationContext环境
*	session 每一次会话都会产生一个新的bean，仅适用于WebApplicationContext环境。

3.	Bean的生命周期
	`默认情况下,会在容器初始化时实例化,我们可以指定Bean节点的lazy-init=”true”来延迟初始化bean`
	
	bean初始化及销毁监听的三种配置方式
*	配置bean时，通过init-method和destroy-method属性为bean指定初始化和销毁方法
*	注解方式配置
*	实现InitializingBean,DisposableBean接口

#### 配置aop
1.	<aop:config>

	切面配置，在这之中将切面织入目标对象
2.	<aop:aspect>

	通过ref指定切面角色类
3.	<aop:pointcut>

	定义切点
	expression 定义切入范围，参数等信息
4.	通知切面

	<aop:before method=""/> 执行之前通知
	<aop:after method=""/>	执行之后通知
	<aop:around method=""/>	环绕，之前和之后的集合
	<aop:after-throwing method=""/>	抛出异常时通知
	<aop:after-returning method=""/>	返回时通知，正常和异常都会通知

