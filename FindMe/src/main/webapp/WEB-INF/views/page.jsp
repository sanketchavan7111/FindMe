<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sp"%>

<sp:url var="css" value="/resources/css" />
<sp:url var="js" value="/resources/js" />
<sp:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>


<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Shop Homepage - Start Bootstrap Template</title>


	<!-- Bootstrap core CSS -->
	<link href="${css}/bootstrap.min.css" rel="stylesheet">
	<link href="${css}/myapp.css" rel="stylesheet">
	

<script type="text/javascript">
window.menu = '${title}';
window.contextRoot='${contextRoot}'
</script>


  </head>

  <body>

<div class="wrapper">
   
   <!-- Navbar -->
   
   <%@include file="./shared/navbar.jsp"%>

<div class="container">

<c:if test="${userClickHome==true}">
    <%@include file="home.jsp"%>
    </c:if>
    
    <c:if test="${userClickAbout==true}">
    <%@include file="about.jsp"%>
    </c:if>
    
    <c:if test="${userClickContact==true}">
    <%@include file="contact.jsp"%>
    </c:if>
    
    <c:if test="${userClickView==true}">
    <%@include file="viewproduct.jsp"%>
    </c:if>
    
    <c:if test="${userClickManageProduct==true}">
    <%@include file="manageproduct.jsp"%>
    </c:if>
    
    
    
    </div>
    <!-- Footer -->
    
    <%@include file="./shared/footer.jsp" %>

</div><!-- Wrapper -->

<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/popper.min.js"></script>
		<script src="${js}/bootstrap.min.js"></script>
		<script src="${js}/myapp.js"></script>

  </body>

</html>
