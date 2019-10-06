<%--
  Created by IntelliJ IDEA.
  User: smska
  Date: 01.10.2019
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login</title>
  </head>
  <style>
    body{

      background:linear-gradient(to right, #DBBE89, #86828B);
    }
    div{
      font-size: 20px;
      font-style:italic;
        font-family: Calibri, serif;
      position: absolute;
      top:250px;
      left:550px;
      color: #44005D;

    }

    .div1{
      position: absolute;
      top:95px;
      left:391px;
    }
  </style>
  <body>
  <form action="jj" method="GET">
  <div >
       <p>
         <b>Login</b>

           <label>
               <input   name="login" placeholder="Write your login" size="60"/>

           </label>


       </p>


       <p>
         <b>Password</b>
           <label>
               <input type="password" name="password" placeholder="Write your password " size="54" >
           </label>
       </p>

       <span class="div1">
         <button type="submit"><b>Send</b></button>
        </span>
  </div>
  </form>
  </body>
</html>
