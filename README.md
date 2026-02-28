-----系统主要功能（用户）-----
1.	登录
登录以获得权限（管理员/用户/被封禁），便于后续操作。
<img width="824" height="409" alt="image" src="https://github.com/user-attachments/assets/8ab24de9-732e-4ba6-a158-8a97eefc2b77" />

2.	查询题目
用户通过searchQuestionVOByPage接口实现通过ES搜索题目。
<img width="865" height="428" alt="image" src="https://github.com/user-attachments/assets/6ef60d5f-aa4c-4a62-b6e0-e30398acfd22" />

3.	限流和熔断
用户调用接口listQuestionVOByPage时：
当接口每秒超过10次请求时触发限流，阻塞操作为提示用户“访问过于频繁，请耐心等待。”。
当接口异常率超过10% 或慢调用（相应时间超过3s）超过20% 触发60s熔断，直接返回本地数据（或空数据）。
<img width="646" height="320" alt="image" src="https://github.com/user-attachments/assets/f9d468a3-2ddf-474a-b573-b4ccb58970ae" />

4.	同端登录检测
用户通过两个同种设备（如两个PC端）登录，先登录的账号会被挤下线，下次操作时会被告知当前已下线。
 <img width="646" height="320" alt="image" src="https://github.com/user-attachments/assets/3ccf4eac-9541-47d9-890e-6c616cd86a51" />
而两个不同种设备（如PC端和移动端）可以同时登录。再登录移动端如图。
 <img width="646" height="320" alt="image" src="https://github.com/user-attachments/assets/8636b559-1eb0-47a9-85cb-5a2a9ccaa82e" />
<img width="865" height="64" alt="image" src="https://github.com/user-attachments/assets/bc65c005-4917-45fc-9afa-f0dadcffbe4a" />
<img width="865" height="79" alt="image" src="https://github.com/user-attachments/assets/b418b2e5-dbbc-494d-83a8-ac5f4e633e8c" />

 
-----系统主要功能（开发人员）-----
该内容面向开发人员和项目团队。
1.	查询题目
管理员可以通过listQuestionByPage接口搜索相关题目并且自动分页。
<img width="951" height="471" alt="image" src="https://github.com/user-attachments/assets/ceadf595-f268-4d95-af7c-cb43960dabe8" />

2.	增删改查题目/题库
管理员可以创建/（批量）删除/编辑/查询题目和题库。
3.	增删改查题目题库关联
管理员可以创建/（批量）删除/编辑/查询题目题库关联。
4.	配置限流熔断规则
管理员可以登录Sentinel配置和查询限流和熔断的详细规则。
 <img width="865" height="408" alt="image" src="https://github.com/user-attachments/assets/dcd60168-357c-47c9-aec6-4e53cb6d57bf" />

5.	查询热Key
管理员可以登录hot-key查看当前的热搜内容。
<img width="865" height="427" alt="image" src="https://github.com/user-attachments/assets/1f9786ae-2eab-4c8e-b5a0-81ecb1fcd578" />

6.	编辑黑名单配置
管理员可以在Nacos中查询和编辑IP黑名单相关配置。
<img width="865" height="428" alt="image" src="https://github.com/user-attachments/assets/485f2fba-7807-4dee-94ae-38ab5b1b81bf" />

7.	篡改数据库
管理员可以在开发工具直接修改数据库内容，如账号权限，题目内容等

