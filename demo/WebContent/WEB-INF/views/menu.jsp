<!DOCTYPE p PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<style type="text/css">
		ul 
		{
		  display: inline;
		  margin: 0;
		  padding: 15px 4px 17px 0;
		  list-style: none;
		  -webkit-box-shadow: 0 0 5px rgba(0, 0, 0, 0.15);
		  -moz-box-shadow: 0 0 5px rgba(0, 0, 0, 0.15);
		  box-shadow: 0 0 5px rgba(0, 0, 0, 0.15);
		}
		ul li {
		  font: bold 12px/18px sans-serif;
		  display: inline-block;
		  margin-right: -4px;
		  position: relative;
		  padding: 15px 20px;
		  background: #fff;
		  cursor: pointer;
		  -webkit-transition: all 0.2s;
		  -moz-transition: all 0.2s;
		  -ms-transition: all 0.2s;
		  -o-transition: all 0.2s;
		  transition: all 0.2s;
		}
		ul li:hover {
		  background: #555;
		  color: #fff;
		}
		ul li ul {
		  padding: 0;
		  position: absolute;
		  top: 48px;
		  left: 0;
		  width: 150px;
		  -webkit-box-shadow: none;
		  -moz-box-shadow: none;
		  box-shadow: none;
		  display: none;
		  opacity: 0;
		  visibility: hidden;
		  -webkit-transiton: opacity 0.2s;
		  -moz-transition: opacity 0.2s;
		  -ms-transition: opacity 0.2s;
		  -o-transition: opacity 0.2s;
		  -transition: opacity 0.2s;
		}
		ul li ul li { 
		  background: #555; 
		  display: block; 
		  color: #fff;
		  text-shadow: 0 -1px 0 #000;
		}
		ul li ul li:hover { background: #666; }
		ul li:hover ul {
		  display: block;
		  opacity: 1;
		  visibility: visible;
		}
		</style>
	</head>
	<body>
		<ul>
		<li>Home</li>
		  <li>About</li>
		  <li>
		    customer module
		    <ul>
		      <li><a href="/demo/customer/form">Add Customer</a></li>
		      <li><a href="/demo/customer/list">customers</a></li>
		      <li>Illustrations</li>
		    </ul>
		  </li>
		  <li>Blog</li>
		  <li>Contact</li>
		</ul>
	</body>
</html>