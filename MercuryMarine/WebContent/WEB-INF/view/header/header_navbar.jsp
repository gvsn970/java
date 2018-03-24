<!-- Navbar ================================================== -->
			<div id="logoArea" class="navbar">
				<a id="smallScreen" data-target="#topMenu" data-toggle="collapse"
					class="btn btn-navbar"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a>
				<div class="navbar-inner">
					<a class="brand" href="http://localhost:8281/MercuryMarine/"><img  
						src="<c:url value="/resources/images/logo.png" />" alt="Mercury" /></a>
				
					<ul id="topMenu" class="nav pull-right">
						<li class=""><a href="<c:url value="/index"/>">Home</a></li>
						<li class=""><a href="<c:url value="/product_summary/" />">View Cart</a></li>
						<li class=""><a href="#">Help</a></li>
						<li class=""><a href="#login" role="button"
							data-toggle="modal" data-target="#myModal" style="padding-right: 0">
							<span
								class="btn btn-large btn-success">MyAccount</span></a>
							<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Login Block</h4>
        </div>
        <div class="modal-body">
								<form >
									
								<label for="email">Email address:</label> <input type="email"
									class="form-control" id="email">
							
							
								<label for="pwd">Password:</label> <input type="password"
									class="form-control" id="pwd">
							
							
								<label class="checkbox"> <input type="checkbox">
									Remember me
								</label>
									 <button type="submit" class="btn btn-success">Sign in</button>
         							 <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
								</form>
							</div>
        <!-- <div class="modal-footer">
         
        </div> -->
      </div>
      
    </div>
  </div>
							</li>
					</ul>
				</div>
			</div>