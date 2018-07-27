# BBS

基于JavaWeb实现的微社区系统，BBS（Bulletin Board System，电子布告栏系统）。

## BBS 系统功能设计

**用户（User）**：登陆（Login）、注册（Register）

**博客（Post）**：

读帖（read）：select post

发帖（write）：insert post

编辑帖子（modify）：update post

搜索（search）：solr

点赞（rate）：

关注（follow）：

分享（share）：

评论（comment）：

阅读量（post_views ）：

分页（pagenation）：

**附加功能**：

消息提醒

草稿

### 数据库

- **用户（User）**：用户ID(userId)#，用户名（username），昵称(nickname)，密码(password)，邮箱（email），
- **关注关系（Follow）**：粉丝（readerID），明星（authorID）
- **帖子（Post）**：帖子id（postId）#，用户ID(userId)，标题（PostTitle），内容(PostContent)，创建时间(CreateTime)，更新时间(UpdateTime)，点赞数（LikeCount），评论数（CommentCount），阅读数（PostView）
- **评论（Comment）**：评论id（CommentID）#，用户ID（UserID），帖子id（PostID），内容（CommentContent），评论时间（CommentTime）。
- **分类（categories）**：分类id（CategoryID）#，分类名称（CategoryName），
- **标签（tags）**：标签id（tagID）#，标签名（tagName），