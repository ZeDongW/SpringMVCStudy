<%--
  Created by IntelliJ IDEA.
  User: ZeDongW
  Date: 2020/9/26 0026
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>table</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/user/add.do" method="POST" >
    <table align="center">
      <tr>
        <td>用户名</td>
        <td><input type="text" name="userName"/></td>
      </tr>
      <tr>
        <td>生日</td>
        <td>
          <input type="text" name="birthDay"/>
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center"><input type="submit" value="提交"></td>
      </tr>
    </table>
  </form>
  </body>
</html>
