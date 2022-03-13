<html>
<script type="text/javascript">


</script>
<body style="background-color:lightblue">
<center>
<div style="background-color:yellow">
<h1><b>Room Management Book</b></h1>
</div>
<marquee behaviour="scroll">This is for Room Management</marquee>
<div style="background-color:red">
<form action="/practise/login" method="post">
	<table>
		<tr>
			<td>Email:</td>
			<td><input type="text" name="email" placeholder="Enter your email" /></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" name="password" minlength=8 placeholder="Enter your Password" /></td>
		</tr>
		<tr >
			<td colspan=2 style="text-align:center"><button type="submit">Log in</button></td>
		</tr>
		<tr>
		<td  style="color:black"><a href="/practise/signup.jsp"><h5>NEW USER</h5></td>&nbsp&nbsp
		<td style="color:black"><a href="/sample-site"><h5>Forget Password</h5></td>
		</tr>
	</table>
</form>
<h4><span style="color:red"><%String error=(String)request.getAttribute("errorMessage"); 
if(error!=null)
out.print(error);
%></h4>
</div>
</center>

</body>
</html>
