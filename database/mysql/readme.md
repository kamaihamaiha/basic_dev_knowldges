## MySql 使用

- Mac 上使用
- 常用命令


### Mac 上使用 MySql

1. 开启mysql服务
```mysql
# cd /usr/local/mysql/support-files
./mysql.server start

# 结果如下(启动成功)
Starting MySQL
.. SUCCESS!
```


2. 查看MySQL 服务的状态
```mysql
/usr/local/mysql/support-files/mysql.server status

# 结果如下(如果正在运行)
SUCCESS! MySQL running (48270)

# 如果没有运行
ERROR! MySQL is not running
```

3. 关闭服务
```mysql
/usr/local/mysql/support-files/mysql.server stop

# 结果如下
Shutting down MySQL
. SUCCESS!
```

4. [重置root用户密码](./reset_root_pwd.md)

5. 查看数据库
```mysql
show databases;

# 默认就有下面四个表：
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
```
- information_schema: 包含了关于 MySQL 服务器本身的信息，例如表、列、索引、用户权限等。
- mysql: 存储 MySQL 用户账户和权限信息的数据库。它包含了用户、密码、权限等信息
- performance_schema: 包含了关于 MySQL 服务器性能的信息，例如锁、IO、线程等
- sys: 包含了一些 MySQL 服务器的系统监控和性能分析的视图

### 常用命令

- 创建数据库: create database your_database_name;
- 删除数据库: drop database your_database_name;
- 查询某个数据库的所有表: show tables from your_database_name;
- 查询某个表的所有字段: show columns from your_table_name;
- 执行sql文件: mysql -u your_username -p your_database_name < your_sql_file.sql
- 查找具有特定字段的表: 
    ```sql
    SELECT table_schema, table_name 
    FROM information_schema.columns
    WHERE column_name = 'your_column_name';
    ```
  - 查找具有特定表的数据库:
      ```sql
      SELECT table_schema  FROM information_schema.tables  WHERE table_name = 'heros';
    
      # 结果如下
      +--------------+
      | TABLE_SCHEMA |
      +--------------+
      | hero         |
      +--------------+
      1 row in set (0.00 sec)
      ```