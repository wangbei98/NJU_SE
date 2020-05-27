# 软件工程笔记



[TOC]



# 第一章 软件工程

1. 软件工程定义
   * 系统的、规范的、可量化的   开发、运行和维护
2. 科学和工程的区别：P6
   * 科学重在把握规律性 
   * 成熟的工程学需要科学知识的指导
3. 软件开发活动 P11
   * 需求开发
   * 软件设计
   * 软件构造
   * 软件测试
   * 软件交付与维护

# 第二章 发展

1. 发展：
   * 50年代： 科学计算，以机器为中心进行编程；像生产硬件一样生产软件
   * 60年代：业务应用（批量数据处理和事务计算）；软件不同于硬件；用软件工艺方式生产软件。
   * 70年代：结构化方法；瀑布模型；强调规则和纪律。
   * 80年代：追求生产力最大化；现代结构化方法/面向对象编程广泛应用；重视过程的作用。
   * 90年代：企业为中心的大规模软件系统开发；追求快速开发、可变更性和用户价值；Web应用出现
   * 00年代：大规模Web应用;大量面向大众的Web穿品；追求快速开发、可变更性、用户价值和创新。

# 第四章 项目管理基础

1. 项目的特征：
   * 明确的目标
   * 限定的开始和结束日期
   * 成本限制
   * 消耗人力和非人力资源
   * 多工种合作
   
2. 项目管理的目标
   * 时间
   * 成本
   * 质量水平
   * 资源
   * 客户认可
   
3. 软件项目管理
   1. 项目启动
   2. 项目计划
   3. 项目执行
   4. 项目跟踪与控制
   5. 项目收尾
   
4. 项目管理具体活动：
   * 计划制定
   * 团队管理
   * 成本控制
   * 质量保障
   * 度量
   * 过程控制
   * 进度跟踪与控制
   * 风险管理
   * 配置管理
   
5. 团队：
   * 共同的目标
   * 共担责任
   * 技能互补
   * 小规模团体
   
6. 团队结构：
   * 主程序员团队
   * 民主团队
   * 开放团队
   
7. 团队建设措施
   * 建立团队章程
   * 持续成功
   * 和谐沟通
   * 避免团队杀手
   
8. 质量属性：选用系统的某些**质量要素**进行量化处理，建立**质量特征**，这些特征被称为质量属性

9. 质量模型：人们从很多质量属性的定义中选择一些能够相互配合、相互联系的**特征集**，它们被称为质量模型。

10. 质量验证的方法：评审、测试、质量度量

11. 主要质量保障活动

    | 里程碑       | 质量保障活动                                     |
    | ------------ | ------------------------------------------------ |
    | 需求开发     | 需求评审、需求度量                               |
    | 体系结构     | 体系结构评审、体系结构度量、集成测试（持续集成） |
    | 详细设计     | 详细设计评审、设计度量、集成测试                 |
    | 实现（构造） | 代码评审、代码度量、集成测试                     |
    | 测试         | 测试、测试度量                                   |

12. 配置管理：用技术和管理的指导和监督方法，来记录和说明配置项的功能和物理特征，控制这些特征的变更，记录和报告变更处理及其实现状态，并验证与需求规格的一致性。

13. 配置项：置于软件配置管理之下的软件配置的各种有关项目，包括各类管理文档、评审记录和文档、软件文档、源码及其可执行码、运行所需的系统软件和支持软件以及相关数据等。

14. 基线：已经通过正式评审的规格说明或制品，可以作为下一步开发的基础，并且只有通过正式的变更控制过程才能变更。

15. 软件配置管理的活动：

    * 标识配置项
    * 版本管理
    * 变更控制
    * 配置审计
    * 状态报告
    * 软件发布管理

16. 配置管理工具

    SVN、CVS、VSS、ClearCase

# 第五章 软件需求基础

1. 需求工程的任务：
   * 说明软件系统将被应用的环境极其目标
   * 将目标和功能反映到软件那系统当中，映射为可行的软件行为，并对软件行为进行准确的规格说明
   * 妥善处理目标和功能随时间演化的变动情况 
   
2. 需求工程活动

   1. 需求开发
      * 需求获取
      * 需求分析
      * 需求规格说明
      * 需求验证
   2. 需求管理

3. 需求获取

   1. 目标分析
      1. 根据问题确定目标
      2. 通过分析利害关系人确定目标
   2. 用户需求获取
      * 面谈
      * 集体获取方法
      * 头脑风暴
      * 原型

4. 需求分析中，需求工程师的人物

   1. 边界分析：系统用例图 & 上下文图
   2. 需求建模:  数据流图 & 实体关系图& 状态转换图& 类图

5. 需求验证的 标准

   * 正确、准确地反映用户意图
   * 需求集在整体上具有完整性和一致性
   * 可读性和可修改性

6. 需求验证方法：

   * 统计评审
   * 原型
   * 模拟

7. 需求：需求就是用户的一种期望，软件系统通过满足用户的期望来解决用户的问题。

8. 需求的层次性：

   * 业务需求：组织为什么要开发系统
   * 用户需求：帮助用户做什么
   * 系统级需求：用户对系统行为的期望

9. 需求、问题域和规格说明

   * 需求是一种期望，源于现实、高于现实
   * 问题域是对现实世界运行规律的一种反映，是需求的产生地，也是需求的解决地
   * 规格说明是软件产品的方案描述。

   忽视需求：软件系统单纯模拟现实而不是改变现实，丢失了软件产品的价值

   忽视问题域：脱离现实构建软件系统，使产品无法投入使用

10. 软件需求的分类：

   * 功能
   * 性能：速度、容量、负载、吞吐量、实时性
   * 质量属性：可靠性、可用性、安全性、可维护性、可移植性、易用性
   * 对外接口
   * 约束

11. 功能需求和非功能需求：

    * 功能需求是和系统主要工作相关的需求，即在不考虑物理约束的情况下，用户希望系统能够执行的活动，这些活动可以帮助用户完成任务
    * 非功能需求：除功能需求（和数据需求）之外的其他四种需求

# 第六章 需求分析方法

1. 需求分析的任务：
   1. **建立需求模型**，达成开发者和用户对需求信息的共同理解
   2. 依据共同理解，发挥创造性，**创建软件系统解决方案**、
2. 需求分析方法：
   * 结构化方法
     * 数据流图
     * 实体关系图
   * 面向对象方法
     * 用例图
     * 类图
     * 交互图
     * 状态图
3. 数据流图：外部实体、过程、数据流、数据存储
4. 用例图：用例、参与者、关系、系统边界‘
5. 用例描述
   * 参与者
   * 触发条件
   * 前置条件
   * 后置条件
   * 正常流程
   * 扩展流程
   * 特殊需求
6. 概念类图：
   * 对象
     * 标识符
     * 状态
     * 行为
   * 类
   * 链接
   * 关联(聚合)
   * 继承
7. 交互图
   * 顺序图
   * 系统顺序图
8. 消息：同步、异步、返回消息
9. 状态图



# PPT预习题

1. 典型团队结构有哪些?
2. 什么是“配置项”?
3. 项目管理的目标是什么?
4. 变更控制的过程是什么?









# 真题

## 1. 名词解释

1. 软件工程
2. 软件需求
3. 持续集成
4. 软件演化生命周期模型
5. 螺旋模型+优缺点+图示
6. 软件设计

## 2. 简答题

1. 解释面向对象体系结构的风格及其优缺点
2. 软件质量保障常用的三种手段
3. 给5个需求描述，说出他们分别是哪种类型的需求
4. 需求分为哪几个层次？
5. 根据图书馆管理系统各举一个每个需求的例子
6. 什么是黑盒测试？
7. 有哪些黑盒测试的方法？
8. 描述软件体系结构的分层风格
9. 人机交互的原则
10. ![屏幕快照 2019-07-25 下午9.28.38](http://ww4.sinaimg.cn/large/006tNc79ly1g5ceoeutxdj30g805978x.jpg)
11. ![屏幕快照 2019-07-26 下午9.05.40](http://ww4.sinaimg.cn/large/006tNc79ly1g5djmwg58rj30hz0e4wm5.jpg)
12. 结合实验，说明一个项目的质量保障包括哪些活动

## 3. 代码改进

1. 代码质量低的地方

   ```java
   class A{
     	FinancialReport fr;
     	WeatherData wd;
     	Count totalCount;
     	init();
   }
   init(){
     	//对fr的3个初始操作
     	//对wd的3个初始操作
     	//对totalCount的1个初始操作
   }//把几个字段的init都放到同一个方法里面
   ```

2. 下面的代码违反了哪个面向对象原则，有什么后果，应如何改进

   ```java
   public class Employee{
     	private string EmployeeName {get ; set ;}
     	private int EmployeeNo {get;set;}
     	public Employee insert(){
         	//datebase logic code
       }
     	public Employee FindByID(){
         	//database logic code;
       }
     	public void GengerateReport(){
         	//set reportFormation
       }
   }
   ```

3. 分析下面这个类的设计是否合理，如果合理，解释原因，不合理分析原因并作出修改

   ```java
   public class Person{
     	String name;
     	public GetAge(){};
   }
   ```

4. 下列是计算雇员所得税代码，请从交互和写作的角度分析代码是否合理

   ```java
   //题目的代码
   public class Employee{
     	Double income;
     	Double getTax(){
         	return income*tax.getTaxRate();
       }
   }
   public class Tax{
     	Double taxrate;
     	Double getTaxRate(){
         	return taxRate;
       }
   }
   
   这个代码的问题应该是：计算所得税的代码不应该暴露在Employee中
   
   // 答案的代码
   public class Employee{
     	double income;
     	double getIncome(){return income};
     	double getTax{
         	Tax tax = new Tax();
         	return tax.getTax();
       }
   }
   public class Tax{
     	double taxRate;
     	double getTaxRate(){
         	return taxRate;
       }
     	double getTax{
         	return employee.getIncome()* tax.getTaxRate()
       }
   }
   不考虑语法错误，感觉这个代码也是毫无逻辑。
   
   
   // 下面是我写的
   public class Employee{
     	Double income;
     	Double getIncome(){return income;}
     	
     	double getTax(){
     			Tax tax = new Tax();
     			return tax.getTax(income);
     	}
   }
   public class Tax{
     	Double taxRate;
     	Double getTaxRate(){
         	return taxRate;
       }
       double getTax(double income){
       		return taxRate * income;
       }
   }
   ```

5. 下列是网络选课系统的部分代码，请从面向对象角度使用多态对以下代码进行合理修改

   ```java
   processCmd (int cmdID){
     	switch (cmdID){
         case 1:addCourse();break;
         case 2:removeCourse();break;
         ...
       }
   }//有大量 switch-case 语句
   ```

6. 消除以下代码的重复

   ```java
   private getTotalSum{
     	//... 
   }
   
   ```

7. 找出代码质量不高的地方，详细说明其问题，并进行改进

   ![屏幕快照 2019-07-25 下午9.08.01](/Users/bellick/Desktop/屏幕快照 2019-07-25 下午9.08.01.png)

8. ![屏幕快照 2019-07-26 下午9.02.01](http://ww3.sinaimg.cn/large/006tNc79ly1g5djjv2cyrj30c20iajzj.jpg)

9. ![屏幕快照 2019-07-26 下午9.03.18](http://ww1.sinaimg.cn/large/006tNc79ly1g5djkdvxhfj30g20iggw9.jpg)

10. ![屏幕快照 2019-07-26 下午9.03.57](http://ww2.sinaimg.cn/large/006tNc79ly1g5djkxyvnej30gg0eqjyz.jpg)

11. ![屏幕快照 2019-07-26 下午9.04.18](http://ww4.sinaimg.cn/large/006tNc79ly1g5djlbrnu9j30d70evgry.jpg)

12. ![屏幕快照 2019-07-26 下午9.06.11](http://ww3.sinaimg.cn/large/006tNc79ly1g5djnf2re8j30e30emdmn.jpg)

13. ![屏幕快照 2019-07-26 下午9.08.34](/Users/bellick/Desktop/屏幕快照 2019-07-26 下午9.08.34.png)

## 4. 画图

1. 分析ATM的取款操作，画出用例图，并编写**用例描述**

2. 根据用例描述画出类图

   ![屏幕快照 2019-07-25 下午9.06.44](/Users/bellick/Desktop/屏幕快照 2019-07-25 下午9.06.44.png)

3. ![屏幕快照 2019-07-26 下午9.07.57](/Users/bellick/Desktop/屏幕快照 2019-07-26 下午9.07.57.png)

## 6. 体系结构题

1. 某一系统能实现如下功能，将一组字符串交替执行大小写转换。例如 I love this game 转化成 I LoVe ThIs GaMe 根据某种体系结构，给出系统物理设计模块依赖图，并解释
   相应模块的职责。
   这题给了一个图例，split 指向 lower、upper，然后 upper 指向 merge

2. ![屏幕快照 2019-07-25 下午9.23.41](http://ww2.sinaimg.cn/large/006tNc79ly1g5cejlq91gj30j70oawoa.jpg)

3. ![屏幕快照 2019-07-25 下午9.25.13](http://ww4.sinaimg.cn/large/006tNc79ly1g5ceku5qc5j30ic0co42t.jpg)

4. 一道关于契约式设计和防御式编程的代码修改题。

   这道题题目很长，具体我不太记得了，大概就是讲取款的操作，有几个条件:1取款金额必须是 100 的整数倍 2 每次取款金额不能超过 3000 3每天 的取款金额不能超过两万 

   (具体代码太长我忘了，这部分我没复习到，瞎写的，题目估计没多大 帮助，教训就是一定要全面复习，感觉重点的类图，设计测试用例，都没考 

5. ![屏幕快照 2019-07-26 下午9.04.37](http://ww2.sinaimg.cn/large/006tNc79ly1g5djlu76xwj30ek03zwgh.jpg)

6. ![屏幕快照 2019-07-26 下午9.05.15](http://ww3.sinaimg.cn/large/006tNc79ly1g5djmbjzjej30do08c0w2.jpg)

7. ![屏幕快照 2019-07-26 下午9.09.09](/Users/bellick/Desktop/屏幕快照 2019-07-26 下午9.09.09.png)

## 7. 选择题 （谁知道考不考呢）

1. 有一个方法 int fun(A&a,int i) 的代码完全是顺序语句，那么最适合他的软件测试技术是： a 边界值分析 b 等价类划分 c 随机测试 d 语句覆盖

2. 软件程序设计时，最为重要的代码质量是： a时间性能和空间性能 b 可靠性 c 易读性 d 安全性

3. 下面的类是哪种内聚  a 过程内聚 b 功能 c 时序 d 逻辑

   ```java
   class Output{
     	public :
     			//outputs a  financial report 
     			void outputreport(financedata);
     			//outputs the current weather 
     			void outputweather (weatherdata);
     			//output a number in a nice formatted way
     			void outputint(int );
   }
   ```

4. ![屏幕快照 2019-07-25 下午9.21.47](http://ww3.sinaimg.cn/large/006tNc79ly1g5cehgor2rj30de0kt7bb.jpg)

5. ![屏幕快照 2019-07-25 下午9.22.18](http://ww3.sinaimg.cn/large/006tNc79ly1g5cehsg9sij30cz03p3zx.jpg)

6. ![屏幕快照 2019-07-25 下午9.26.36](http://ww4.sinaimg.cn/large/006tNc79ly1g5ceman8gvj30h70kwtks.jpg)

7. ![屏幕快照 2019-07-25 下午9.26.23](http://ww1.sinaimg.cn/large/006tNc79ly1g5cemijgmmj30ip05t0w1.jpg)



