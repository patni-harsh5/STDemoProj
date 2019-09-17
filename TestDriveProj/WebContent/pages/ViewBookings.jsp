<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.ArrayList, java.util.List, com.beans.Tata"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title></title>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/style1.css">
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>


<header>
  <h2>TATA MOTORS</h2>
</header>

<section>

  <nav>
    <ul>
      <li><a href="#">Contact</a></li>
      <li><a href="#">Inquiry</a></li>
    </ul>
  </nav>
 
  <article>
    <h1>View Booking</h1>
    <form action="<%=request.getContextPath()%>/TataServlet" id="myform" method="post" >
    <input type="hidden" id="page" name="page" value="viewTestdrive">
 
 Booking Date: <span style="color:red">*</span><br>
  <input type="date" name="bookingdate" placeholder="mm/dd/yyyy" required>
  <br><br>
  
  <br>
  <input type="submit" value="Submit">
  
  <br><br>
  <table name="search-results" border="1">
  <tr>
  	<th>Booking ID</th>
  	<th>Customer name</th>
  	<th>License Number</th>
  	<th>Vehicle Make</th>
  	<th>Date</th>
  </tr>
  <%
  List<Tata> tataList = (ArrayList<Tata>)request.getAttribute("list1");
  
  if(tataList != null)  {
	  

  for(Tata t : tataList){
  %>
  <tr>
  <th><%= t.getBookingID() %></th>
  <th><%= t.getCustomerName() %></th>
  <th><%= t.getLicenseNo() %></th>
  <th><%= t.getVehicleMake() %></th>
  <th><%= t.getDate() %></th>
  
  </tr>
  
  <%
  }
  }
  %>
  
  
  </table>
  
  
  
  
  
  
  
</form> 
    
  </article>
</section>

<footer>
  <p><a href="www.tatamotors.com">@TataMotors</a></p>
</footer>



</body>
</html>
