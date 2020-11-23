微人事是一个前后端分离的人力资源管理系统，项目采用SpringBoot+Vue开发。  
  
# 整体效果

首先，不同的用户在登录成功之后，根据不同的角色，会看到不同的系统菜单，完整菜单如下：  

![p278](https://raw.githubusercontent.com/wiki/lenve/vhr/doc/p278.png)  

不同用户登录上来之后，可能看到的会有差异，如下：  

![p279](https://raw.githubusercontent.com/wiki/lenve/vhr/doc/p279.png)  

每个用户的角色是由系统管理员进行分配的，系统管理员给用户分配角色的页面如下：  

![p280](https://raw.githubusercontent.com/wiki/lenve/vhr/doc/p280.png)  

系统管理员也可以管理不同角色可以操作的资源，页面如下：  

![p281](https://raw.githubusercontent.com/wiki/lenve/vhr/doc/p281.png)  


# 技术栈

## 后端技术栈

1.SpringBoot  
2.SpringSecurity  
3.MyBatis  
4.MySQL  

## 前端技术栈

1.Vue  
2.ElementUI  
3.axios  
4.vue-router  

还有其他一些琐碎的技术就不一一列举了。  

# 快速部署

1.数据库脚本放在hrserver项目的resources目录下，在MySQL中执行数据库脚本  

2.数据库配置在hrserver项目的resources目录下的application.properties文件中  

3.在IntelliJ IDEA中运行hrserver项目  

**OK，至此，服务端就启动成功了，此时我们直接在地址栏输入```http://localhost:8082/index.html```即可访问我们的项目，如果要做二次开发，请继续看第五、六步。**  

5.进入到vuehr目录中，在命令行依次输入如下命令：  

```
# 安装依赖
npm install

# 在 localhost:8080 启动项目
npm run dev
```  

由于我在vuehr项目中已经配置了端口转发，将数据转发到SpringBoot上，因此项目启动之后，在浏览器中输入```http://localhost:8080```就可以访问我们的前端项目了，所有的请求通过端口转发将数据传到SpringBoot中（注意此时不要关闭SpringBoot项目）。  

6.最后可以用WebStorm等工具打开vuehr项目，继续开发，开发完成后，当项目要上线时，依然进入到vuehr目录，然后执行如下命令：  

```
npm run build
```  

该命令执行成功之后，vuehr目录下生成一个dist文件夹，将该文件夹中的两个文件static和index.html拷贝到SpringBoot项目中resources/static/目录下，然后就可以像第4步那样直接访问了。  


**步骤5中需要大家对NodeJS、NPM等有一定的使用经验，不熟悉的小伙伴可以先自行搜索学习下，推荐[Vue官方教程](https://cn.vuejs.org/v2/guide/)。**  
