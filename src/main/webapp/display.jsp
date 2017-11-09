<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- Result is=<%= request.getAttribute("result") %>
Result using Expression Language : ${result}
 -->
     
  
  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Department</th><th>Number</th></tr>  
   <tr>  
   <td>${name}</td>  
   <td>${id}</td>  
   <td>${dept}</td>  
   <td>${number}</td>  
   </tr>  
   </table>  
 
 


</body>
</html>