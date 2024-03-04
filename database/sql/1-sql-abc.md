## 了解SQL：一门半衰期很长的语言

SQL 语言按照功能划分成以下的 4 个部分：

- DDL，英文叫做 Data Definition Language，也就是数据定义语言，它用来定义我们的数据库对象，包括数据库、数据表和列。通过使用 DDL，我们可以创建，删除和修改数据库和表结构。
- DML，英文叫做 Data Manipulation Language，数据操作语言，我们用它操作和数据库相关的记录，比如增加、删除、修改数据表中的记录。
- DCL，英文叫做 Data Control Language，数据控制语言，我们用它来定义访问权限和安全级别。
- DQL，英文叫做 Data Query Language，数据查询语言，我们用它查询想要的记录，它是 SQL 语言的重中之重。在实际的业务中，我们绝大多数情况下都是在和查询打交道，因此学会编写正确且高效的查询语句，是学习的重点。

### 相关概念

- DBMS: 数据库管理系统
- ER 图（Entity Relationship Diagram），即实体 - 关系图
  - 模型三要素：实体、属性、关系
    - 关系
      - 一对一
      - 一对多
      - 多对多
- SQL 大小写的问题，要点：
  - 表名、表别名、字段名、字段别名等都小写；
  - SQL 保留字、函数名、绑定变量等都大写。
    ```sql
     SELECT name, hp_max FROM heros WHERE role_main = '战士'
    ```