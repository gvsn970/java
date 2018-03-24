
	$(".add-to-cart").click(function (event){
	  
	event.preventDefault()
	
	var name=$(this).attr("data-name");
	var photo=$(this).attr("data-photo");
	var price=Number($(this).attr("data-price"));
	addItemToCart(name,photo,price,1);
	displayCart();
	
	
	});
	
	$("#clear-cart").click(function (event){
	
	clearCart();
	displayCart();
	});
	
	function displayCart(){
	
	
	var cartArray=listCart();
	
	var output="";
	
	for(var i in cartArray){
	
	output +="<li>"+cartArray[i].photo
					+"<i style='font-size:20px;'> "+cartArray[i].name+"</i>&nbsp;&nbsp;&nbsp;"
					+"<input class='input-append span1' style='max-width:34px' readonly placeholder='"+cartArray[i].count+"'  size='16' type='text'>"
					+"<i class='icon-remove icon-white'></i> "+"<input class='input-append span1' readonly style='max-width:34px' placeholder='"+cartArray[i].price+"'  size='16' type='text'> "
					+"="+" <button class='btn btn-primary'>"+ cartArray[i].total+"</button>"
					+"<button class='subtract-item btn' data-name='"+cartArray[i].name+"'><i class='icon-minus'></i></button>"
					+"<button class='add-item btn' data-name='"+cartArray[i].name+"'><i class='icon-plus'></i></button>"
					
					+"<button class='delte-item btn btn-danger' data-name='"+cartArray[i].name+"'><i class='icon-remove icon-white'></i></button>"+" <br/><br/><br/> "
					+"</li>";
	}
	$("#show-cart").html(output);
	$("#total-cart1").html( totalCart() );
	$("#total-cart").html( totalCart() );
	$("#count-cart-menu").html( countCart() );
	$("#count-cart").html( countCart() );
	
	$("#count-cart-header").html( countCart() );
	$("#count-cart-shoping").html( countCart() );
	$("#total-cart-menu").html( totalCart() );
	$("#total-cart-header").html( totalCart() );
	
	}
	$("#show-cart").on("click",".delte-item",function (event){
		
		var name=$(this).attr("data-name");
		removeItemFromCartAll(name);
		displayCart();
	});
	
	$("#show-cart").on("click",".subtract-item",function (event){
	
	var name=$(this).attr("data-name");
	removeItemFromCart(name);
	displayCart();
	});
	
	$("#show-cart").on("click",".add-item",function (event){
	
	var name=$(this).attr("data-name");
	
	addItemToCart(name,0,0,1);
	displayCart();
	
	});
	
	
	  //*******************************************************======================
     //==================================Shoping Cart Functions

var cart=[];
var Item=function(name,photo,price,count){

	this.name=name
	this.photo=photo
	this.price=price
	this.count=count

};

//=====================addItemToCart===============================

function addItemToCart(name,photo,price,count){

	for(i in cart){
			if(cart[i].name===name){

				cart[i].count+=count;
					saveCart();
					return;
			}
		}

		var item=new Item(name,photo,price,count);

		cart.push(item);

	saveCart();
}



//==================================removeItemFromCart===========================

function removeItemFromCart(name){

for(var i in cart){

		if(cart[i].name === name ){
		
			cart[i].count--;
			if(cart[i].count==0){
			
			cart.splice(i,1);
			}
			break;
		}
	}
	saveCart();

}




//===================================removeItemFromCartAll=============================

function removeItemFromCartAll(name){
 for(var i in cart){
 
	if(cart[i].name===name){
	cart.splice(i,1);
	break;
	}
 }
saveCart();
}
//removeItemFromCartAll("car");
//console.log(cart);



 

//===================================ClearCart========================================

function clearCart(){

cart=[];
saveCart();
}
//clearCart();
//console.log(cart);
//=====================================Cart countCart totalCart=========================

function countCart(){

	var totalCount=0;
	for(var i in cart){
	
		totalCount +=cart[i].count;
		
	}
	return totalCount;
}

function totalCart(){
		
		var totalCost=0;
		for(var i in cart){
		
			totalCost +=cart[i].price * cart[i].count;
		}
		return totalCost.toFixed(2);;
	}

//console.log(countCart());
//console.log(totalCart());

//========================================ListCart=============================================

function listCart(){

var cartCopy =[];
for(var i in cart){

var item=cart[i];

var itemCopy={};
for(var p in item){
itemCopy[p]=item[p];

}
 itemCopy.total =(item.price * item.count).toFixed(2);;
cartCopy.push(itemCopy);
}
return cartCopy;
}

 
 //===========================================SAVE CART==================================
 
 function saveCart(){
 
 localStorage.setItem("shopingCart",JSON.stringify(cart));
 }

 //===========================================LOAD CART==========================
 
function loadCart(){

cart=JSON.parse(localStorage.getItem("shopingCart"));
}

 loadCart();
 displayCart();
