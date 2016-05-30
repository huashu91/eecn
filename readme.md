#This it the readme document for eecn.

###+ The java source code is in the src folder.
###+ This is first setup in 2016-05-30 00:43:45.

###+ Add some jsp files into the project.
###+ Add css and js files into the project.
###+ The local time is 2016-05-30 14:24:00.

###+ 2016-05-30 21:56:04

一、整体概述
1.系统运行要求

TOMCAT+JSP+MYSQL
2.功能介绍
a)数据库基本操作（查询，备份）
b)系统安全（权限细分、管理分组、管理锁定）

二、数据库文档
a)库存放路径：jdbc:mysql://127.0.0.1/testsport
b)库设计习惯
i.使用英文单词作为字段名，一律小写，不含下划线等字符
ii.除ID类唯一标识符外全部采用text类型存储
iii.表名采用英文单词命名
c)所有数据内容
i.game（比赛表）
字段名	类型	备注
id	int	自动生成的索引标识
name	text	比赛名称
group1	text	组别（男子/女子）
group2	text	组别（小学/初中/职中/高中/职高）
status	text	比赛状态（未开放/报名阶段/比赛阶段/已结束）
other	text	其他比赛信息（报名起始和结束时间...）

ii.admin（管理员表）
字段名	类型	备注
id	int	自动生成的索引标识
username	text	管理员用户名
password	text	管理员密码
authority	text	管理员权限等级
other	text	其他

iii.student（学生表）
字段名	类型	备注
id	int	自动生成的索引标识
name	text	学生姓名
gender	text	学生性别
grade	text	学生年级
class	text	学生班级
idcard	text	学生身份证号
school	text	学生所在学校
other	text	其他

iv.sign（报名表）
字段名	类型	备注
studentid	int	报名学生id
gameid	id	学生所报比赛的id
other	text	其他

v.
d)关键数据内容
e)
三、程序源码文档
a)
四、二次开发
a)