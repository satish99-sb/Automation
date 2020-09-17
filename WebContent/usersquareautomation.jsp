<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>User</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
     <!-- MORRIS CHART STYLES-->
    <link href="assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
				
                <a class="navbar-brand" href="stock.html">SQUARE</a> 
				
            </div>
  <div style="color: white;
padding-top:15px;

font-size: 16px;
text-align:center;">Welcome user|System,HR And Admin    MY Account|  <span><a href="sqfront2.jsp" class="btn btn-warning" style="font-size:15px; margin-top:-5px; margin-left:-10px;">Logout</a> </div>
        </nav>   
		
		
		
		
		
		 <!-- /. NAV TOP  -->
                <nav class="navbar-default navbar-side" role="navigation" style="margin-top:-20px;">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				
				
					
                   <li class="text-center">
                   
					</li>
				
					
                    <li>
                        <a class="active-menu"  href="index.html"><i class="fa fa-dashboard fa-3x"></i> DASHBOARD</a>
                    </li>
                     <li>
                        <a href="#"><i class="fa fa-shopping-cart fa-3x"></i> PRODUCT DETAIL<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="usersquareautomation.jsp">PRODUCT IN DETAIL</a>
                            </li>
                            <li>
                                <a href="usersquareautomation1.jsp">PRODUCT STOCK DETAIL</a>
                            </li>
<li>
                                <a href="usersquareautomation2.jsp">PRODUCT OUT DETAIL</a>
                            </li>                        </ul>
                      </li> 
						  
                    
						  
                     <li>
                        <a href="#"><i class="fa fa-edit fa-3x"></i>VIEW PRODUCT<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="usersqdb.jsp"> VIEW PRODUCT IN </a>
                            </li>
                            <li>
                                <a href="usersqdb1.jsp"> VIEW PRODUCT STOCK</a>
                            </li>
                    <li>
                                <a href="usersqdb2.jsp"> VIEW PRODUCT OUT</a>
                            </li>
                        </ul>
                      </li> 			   
					
					  <li>
                        <a href="#"><i class="fa fa-edit fa-3x"></i> REPORT<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="userreportdate.jsp">PRODUCT IN</a>
                            </li>
                            <li>
                                <a href="userreportdate1.jsp">PRODUCT STOCK</a>
                            </li>
                       <li>
                                <a href="userreportdate2.jsp">PRODUCT OUT</a>
                            </li>
                        </ul>
                      </li> 
						  
                    
                    
                </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                     <h2>PRODUCT IN DETAIL</h2>   
                      
                       
                    </div>
                </div>
                 <!-- /. ROW  -->
                 <hr />
               <div class="row">
                <div class="col-md-12">
                    <!-- Form Elements -->
                    <div class="panel panel-default">
                       
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-md-6">
                                    
                                   
                                       <form action="ProductInA" method="post">
                                       
                                        <div class="form-group">
                                            <label>PRODUCT NAME</label>
                                            <input class="form-control" name="proname" />
                                        </div>
                                        
										<div class="form-group">
                                            <label>PRODUCT DESCRIPTION</label>
                                            <input class="form-control" name="prodesc" />
                                            
                                        </div>
										
										<div class="form-group">
										<label>PRODUCT IN DATE</label>
                                          
 											 <input type="date" name="date">
 
    
 											 <br>
  </div>
										
										</div>
										<div class="col-md-6">
										
										<div class="form-group">
                                            <label>QUANTITY IN</label>
                                            <input class="form-control" name="proqty"/>
                                            
                                        </div>
										   										 
										</div>
										
                                

                                 
    </div>
                                  
                                
                            </div>
							
                        </div>
                    </div>
                    
                     <!-- End Form Elements -->
					  <center><input type="submit" value="In" class="btn btn-primary"></center>
               </form>
                </div>
				<div class="container-fluid">
  
  <table class="table">
    <thead>
      <tr>             
        <th>PRODUCT SR NO</th>
		<th>PRODUCT NAME</th>
		<th>PRODUCT DESCRITPTION</th>		
		<th>PRODUCT IN DATE</th>
		<th>QUANTITY IN</th>
      </tr>
    </thead>
    <tbody>
    
    		
	 		
			
     	<tr class="success">
     	<c:forEach var="pro" items="${List}" >
     	<tr>
		<td>${pro.id}</td>
        <td>${pro.proname }</td>
		<td>${pro.prodesc }</td>
		<td>${pro.date }</td>
		<td>${pro.proqty }</td>
	
      </tr>   
	</c:forEach>
	</tr> 
	 
    <!--  <tr class="success">
         
		
         <td>2</td>
        <td>PRO2</td>
		<td>BOX2</td>
		<td>2/11/2018</td>
		<td>350</td>
		<td>R. M. MAC</td>
		<td>900</td>
		
		
      </tr>
     <tr class="warning">
            
		<td>3</td>
        <td>PRO3</td>
		<td>BOX3</td>
		<td>18/03/2018</td>
		<td>350</td>
		<td>N. MEX</td>
		<td>700</td>
		
         
		
      </tr>
       -->
     
    </tbody>
  </table>
</div>
				
				
				
				
            </div>
			
         
               
    </div>
             <!-- /. PAGE INNER  -->
            </div>
         <!-- /. PAGE WRAPPER  -->
        </div>
     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="assets/js/jquery.metisMenu.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    
   
</body>
</html>
