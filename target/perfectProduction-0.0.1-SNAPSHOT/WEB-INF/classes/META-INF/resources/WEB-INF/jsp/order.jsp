<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>Perfect Production</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->
		<!-- bootstrap -->
		<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">      
		<link href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
		<link href="bootstrap/css/users.css" rel="stylesheet">
		<link href="themes/css/bootstrappage.css" rel="stylesheet"/>
		<link href="bootstrap/css/ppstyles.css" rel="stylesheet">
		
		
		<!-- global styles -->
		<link href="themes/css/flexslider.css" rel="stylesheet"/>
		<link href="themes/css/main.css" rel="stylesheet"/>

		<!-- scripts -->
		<script src="themes/js/jquery-1.7.2.min.js"></script>
		<script src="bootstrap/js/bootstrap.min.js"></script>				
		<script src="themes/js/superfish.js"></script>	
		<script src="themes/js/jquery.scrolltotop.js"></script>
		<!--[if lt IE 9]>			
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
			<script src="js/respond.min.js"></script>
		<![endif]-->
	</head>
    <body>		
		<jsp:include page="header.jsp" />
		<div id="wrapper" class="container homeclass" style="height: 100%">
		 <div class="row col-md-12 ">
<div class="span12 e">
		 	
		 	<form:form action="/placeorder" method="post" modelAttribute="orderdto" enctype="multipart/form-data">
				<div class="form-group span3">
					<label>Fabricator</label>
					<form:input class="form-control panelinput" path="fabricator" placeholder="Enter fabricator"></form:input>	
				</div>
				<div class="form-group span3">
					<label>client</label>
					<form:input class="form-control panelinput" path="client" placeholder="Enter client"></form:input>	
				</div>
				<div class="form-group span3">
					<label>Product</label>
					<form:input class="form-control panelinput" path="product" placeholder="Enter product"></form:input>	
				</div>
				<div class="form-group span3">
					<label>Rolltype</label>
					<form:input class="form-control panelinput" path="rolltype" placeholder="Enter rolltype"></form:input>	
				</div>
				<div class="form-group span3">
					<label>Rolls</label>
					<form:input class="form-control panelinput" path="rolls" placeholder="Enter number of rolls"></form:input>	
				</div>
				<div class="form-group span3">
					<label>Design</label>
					<form:input type="file" class="form-control panelinput" path="design" placeholder="Enter number of rolls"></form:input>	
				</div>
				<div class="form-group span3">
					<label>Description</label>
					<form:textarea class="form-control panelinput" path="remark" ></form:textarea>	
				</div>
				<div class="form-group span3">
					
					<input type="submit" class="btn formbtn btn-outline btn-success" value="Add"/>
				</div>
			</form:form>
		 	</div>
		 	
		 	
		 	
		 	<div class="span12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Orders
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-hover">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>Oder no.</th>
                                            <th>Fabricator</th>
                                            <th>client</th>
                                            <th>Rolltype</th>
                                            <th>Rolls</th>
                                            <th>Design</th>
                                            <th>Actions</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${orders}" var="order">
                                        <tr>
                                            <td></td>
                                            <td>${order.id }</td>
                                            <td>${order.fabricator }</td>
                                            <td>${order.client }</td>
                                            <td>${order.rolltype }</td>
                                            <td>${order.rolls }</td>
                                            <td>${order.design }</td>
                                            <td><a>Edit</a></td>
                                            
                                        </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
		 </div>
			
		
			<div class="span12">
				<div class=" footer">
					<section id="copyright">
						<span>Copyright 2013 bootstrappage template  All right reserved.</span>
					</section>
				</div>
			</div>
		</div>
		<script src="themes/js/common.js"></script>
		<script src="themes/js/jquery.flexslider-min.js"></script>
		<script type="text/javascript">
			$(function() {
				$(document).ready(function() {
					$('.flexslider').flexslider({
						animation: "fade",
						slideshowSpeed: 4000,
						animationSpeed: 600,
						controlNav: false,
						directionNav: true,
						controlsContainer: ".flex-container" // the container that holds the flexslider
					});
				});
			});
		</script>
    </body>
</html>