<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Login Form</title>
  <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Open+Sans:600'>

      <link rel="stylesheet" href="css/style.css">

</head>

<body>
  <div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
		<div class="login-form">
		<form action="Login" method="post">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Username</label>
					<input id="user" name="uname" type="text" class="input" required>
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" name="psw" type="password" class="input" data-type="password" required>
				</div>
				<div class="group">
					<input id="check" type="checkbox" class="check">
					<label for="check"><span class="icon"></span> Keep me Signed in</label>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign In">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="#forgot">Forgot Password?</a>
				</div>
			</div>
			</form>
			<form action="UserReg" method="post">
			<div class="sign-up-htm">
				<div class="group">
					<label for="user" class="label">Username</label>
					<input type="text" name="user" class="input" required>
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input type="password" name="pass" id="pass1" class="input" data-type="password" required>
				</div>
				<div class="group">
					<label for="pass" class="label">Repeat Password</label>
					<input type="password" id="conpass" class="input" data-type="password" onfocusout="validatePassword()" required>
				</div>
				<div class="group">
					<label for="Auser" class="label">ADMIN USER</label>
					<input type="text" name="Auser" class="input" value="admin" readonly>
				</div>
				<div class="group">
					<label for="Apass" class="label">ADMIN PASSWORD</label>
					<input type="password" name="Apass" class="input" data-type="password" required>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign Up">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<label for="tab-1"><a href="index.jsp">Already Member?</a></label>
				</div>
			</div>
			</form>
		</div>
	</div>
</div>
  
<script src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
  <script>
function validatePassword(){
  if($('#pass1').val() != $('#conpass').val()) {
	  	document.getElementById('conpass').setCustomValidity("Passwords Don't Match");
		  document.getElementById('conpass').checkValidity();
		  $('#pass1').val("");$('#conpass').val("");
  } else {
	  document.getElementById('pass1').setCustomValidity('');
  }
}
  </script>
</body>
</html>