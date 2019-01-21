<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>User Information</h2>
          <form:form method = "POST" action = "/userinfo">
         <table>
            <tr>
                <td>Username<input type="text" name="name"></td>
            </tr>
            <tr>
               <td>Password<input type="password" name="password"></td>
            </tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>
      </form:form>
   </body>

</html>