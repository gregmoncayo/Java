var _inside=_inside||[];var _insideLoaded=_insideLoaded||false;(function(){if(_insideLoaded)
return;_insideLoaded=true;var accountKey="IN-1000600";var trackerURL="gucci-track.inside-graph.com";var useCustomFunctionForCheckout=true;var insideOrderTotal=0;var maxLoop=20;var curLoop=0;var firstCall=false;var cursize="";var tempJQ=tempJQ||null;var curvisitorobj=null;var sizevisible=false;var detectSearchByUrl=true;var searchUrl="/search?";var searchClassName=null;var detectProductCategoryByUrl=true;var productCategoryUrl="/capsule/gucci-guilty-fragrance";var productCategoryClassName=null;var detectProductByUrl=true;var productUrl=null;var productClassName=null;var detectCheckoutByUrl=true;var checkoutUrl="/cart";var checkoutClassName=null;var detectOrderConfirmedByUrl=true;var orderConfirmedUrl="checkout/orderConfirmation";var orderConfirmedClassName=null;function log(){if(typeof(console)!="undefined"&&typeof(console.log)!="undefined"){}}
function addCommas(nStr){try{nStr+='';x=nStr.split('.');x1=x[0];x2=x.length>1?'.'+x[1]:'';var rgx=/(\d+)(\d{3})/;while(rgx.test(x1)){x1=x1.replace(rgx,'$1'+','+'$2');}
return x1+x2;}
catch(tempex){}
return nStr;}
function getDecimalSign(number){try{var tempnum=myTrim(number);if(number.length>3){var tempres=number.charAt(number.length-3);if(tempres=="."||tempres==",")
return tempres;}}
catch(signex){}
return ".";}
function deferWait(callback,test){if(test()){callback();return;}
var _interval=10;var _spin=function(){if(test()){callback();}
else{_interval=_interval>=1000?1000:_interval*2;setTimeout(_spin,_interval);}};setTimeout(_spin,_interval);}
function keepWait(callback,test){if(test()){callback();if(curLoop>=maxLoop){return;}}
var _interval=1000;var _spin=function(){if(test()){curLoop=curLoop+1;callback();if(curLoop>=maxLoop){return;}}
setTimeout(_spin,_interval);};setTimeout(_spin,_interval);}
var indexOf=[].indexOf||function(prop){for(var i=0;i<this.length;i++){if(this[i]===prop)
return i;}
return-1;};var getElementsByClassNameManual=function(className,context){if(context.getElementsByClassName)
return context.getElementsByClassName(className);var elems=document.querySelectorAll?context.querySelectorAll("."+className):(function(){var all=context.getElementsByTagName("*"),elements=[],i=0;for(;i<all.length;i++){if(all[i].className&&(" "+all[i].className+" ").indexOf(" "+className+" ")>-1&&indexOf.call(elements,all[i])===-1)
elements.push(all[i]);}
return elements;})();return elems;};function myTrim(text){if(typeof(text)!="undefined"&&text!=null)
return typeof(text.trim)==="function"?text.trim():text.replace(/^\s+|\s+$/gm,'');return null;}
function isNumber(o){return!isNaN(o-0)&&o!==null&&o!==""&&o!==false;}
function isNumeric(n){try{return!isNaN(parseFloat(n))&&isFinite(n);}
catch(tempex){}
return false;}
function randomIntFromInterval(min,max){try{return Math.floor(Math.random()*(max-min+1)+min);}
catch(tempex){}
return min;}
function setCookie(cname,cvalue,exdays){var d=new Date();d.setTime(d.getTime()+(exdays*24*60*60*1000));var expires="expires="+d.toGMTString();document.cookie=cname+"="+cvalue+"; "+expires+";path=/";}
function getCookie(cname){var name=cname+"=";var ca=document.cookie.split(';');for(var i=0;i<ca.length;i++){var c=myTrim(ca[i]);if(c.indexOf(name)==0)
return c.substring(name.length,c.length);}
return null;}
function deleteCookie(cname){document.cookie=cname+"="+0+"; "+"expires=01 Jan 1970 00:00:00 GMT"+";path=/";}
function jsUcfirst(string){try{return string.charAt(0).toUpperCase()+string.slice(1);}
catch(tempex){}
return string;}
function toTitleCase(string){try{return string.replace(/\w\S*/g,function(txt){return txt.charAt(0).toUpperCase()+txt.substr(1).toLowerCase();});}
catch(tempex){}
return string;}
function roundToTwo(num){if(Math!="undefined"&&Math.round!="undefined")
return+(Math.round(num+"e+2")+"e-2");else
return num;}
function getSearchParameters(){var prmstr=window.location.search.substr(1);return prmstr!=null&&prmstr!=""?transformToAssocArray(prmstr):[];}
function transformToAssocArray(prmstr){var params=[];var prmarr=prmstr.split("&");for(var i=0;i<prmarr.length;i++){params[i]=prmarr[i];}
return params;}
function getViewData(){try{var data={};data.action="trackView";data.type="article";data.url=window.location.href;data.name="Current Page: "+window.location.href;var temp_loc=window.location.href.split("://")[1].split("/");var page="";var params=getSearchParameters();var searchterm="Search";if(params!=null&&params.length>0){for(var i=0;i<params.length;i++){if(params[i].indexOf("text=")==0){searchterm=params[i].split("text=")[1];}}}
for(var i=1;i<temp_loc.length;i++){if(temp_loc[i]!=null&&temp_loc[i].length>0)
page=temp_loc[i];}
var curpage=page.split("?")[0];var temphome=getElementsByClassNameManual("template-pages--home-homepage",document);if((curpage==""||curpage=="/"||curpage=="index.html"||curpage=="#")&&temp_loc.length<3){data.type="homepage";}
else if(temphome!=null&&temphome.length>0){data.type="homepage";}
else if(typeof(pageType)!="undefined"&&pageType!=null&&pageType.length>0){if(pageType.toLowerCase().indexOf("category")==0){data.type="productcategory";}
else if(pageType.toLowerCase().indexOf("product")==0){data.type="product";}
else if(pageType.toLowerCase().indexOf("shopthelook")==0){data.type="shopthelook";}}
else if(data.url.toLowerCase().indexOf("/login")!=-1||data.url.toLowerCase().indexOf("/signin")!=-1){data.type="login";}
if(detectSearchByUrl&&searchUrl!=null){if(data.url.indexOf(searchUrl)!=-1){data.type="search";}}
else if(searchClassName!=null){var tempelem=getElementsByClassNameManual(searchClassName,document);if(tempelem!=null&&tempelem.length>0){data.type="search";}}
if(detectProductCategoryByUrl&&productCategoryUrl!=null){if(data.url.indexOf(productCategoryUrl)!=-1){data.type="productcategory";}}
else if(productCategoryClassName!=null){var tempelem=getElementsByClassNameManual(productCategoryClassName,document);if(tempelem!=null&&tempelem.length>0){data.type="productcategory";}}
if(detectProductByUrl&&productUrl!=null){if(data.url.indexOf(productUrl)!=-1){data.type="product";}}
else if(productClassName!=null){var tempelem=getElementsByClassNameManual(productClassName,document);if(tempelem!=null&&tempelem.length>0){data.type="product";}}
if(detectCheckoutByUrl&&checkoutUrl!=null){if(data.url.indexOf(checkoutUrl)!=-1||data.url.indexOf("/checkout")!=-1){data.type="checkout";}}
else if(checkoutClassName!=null){var tempelem=getElementsByClassNameManual(checkoutClassName,document);if(tempelem!=null&&tempelem.length>0){data.type="checkout";}}
if(detectOrderConfirmedByUrl&&orderConfirmedUrl!=null){if(data.url.indexOf(orderConfirmedUrl)!=-1){data.type="orderconfirmed";}}
else if(orderConfirmedClassName!=null){var tempelem=getElementsByClassNameManual(orderConfirmedClassName,document);if(tempelem!=null&&tempelem.length>0){data.type="orderconfirmed";}}
switch(data.type){case "homepage":data.name="Home";break;case "search":data.name=decodeURIComponent(searchterm);if(data.name.length==0){data.name="Search Page"}
break;case "shopthelook":var tempPageName=getPageName();if(tempPageName!=null&&tempPageName.length>0)
data.name=tempPageName;var tempval=getLookImage();if(tempval!=null&&tempval.length>0)
data.img=tempval;break;case "productcategory":var tempcat=getCategory();if(tempcat!=null&&tempcat.length>0)
data.category=tempcat;var tempPageName=getPageName();if(tempPageName!=null&&tempPageName.length>0)
data.name=tempPageName;break;case "product":var tempPageName=getPageName();if(tempPageName!=null&&tempPageName.length>0)
data.name=tempPageName;tempPageName=getProductName();if(tempPageName!=null&&tempPageName.length>0)
data.name=tempPageName;var tempcat=getCategory();if(tempcat!=null&&tempcat.length>0)
data.category=tempcat;var tempval=getProductImage();if(tempval!=null&&tempval.length>0)
data.img=tempval;var tempsku=getProductSku();if(tempsku!=null&&tempsku.length>0){data.sku=tempsku;if(data.name.toLowerCase().indexOf(tempsku.toLowerCase())==-1){data.name=data.name+" #"+tempsku;}}
var tempprice=getProductPrice();if(tempprice!=null&&tempprice>0){data.price=tempprice;try{var temptextprice=tempprice;if(typeof temptextprice==='string'||temptextprice instanceof String)
temptextprice=parseFloat(temptextprice);data.name="$"+addCommas(Math.trunc(temptextprice).toString())+" - "+data.name;}
catch(temppriceex){}}
var sizeavail=getProductSizeAvailable();if(typeof(data.data)=="undefined"){data.data={};}
data.data.sizeavailable=sizeavail;var tempavail=getProductAvailability();if(tempavail!=null&&tempavail.length>0){data.data.availability=tempavail;}
if(sizeavail){var tempsize=getProductSize();if(tempsize!=null&&tempsize.length>0){data.data.size=tempsize;}}
break;case "orderconfirmed":data.name="Order Confirmed";break;default:data.name=curpage;try{data.name=curpage.replace(/_/g,' ');}
catch(tempex){}}
if(data.type=="shopthelook")
data.type="productcategory";if(data.type!="product")
data.name=toTitleCase(data.name);var tempnode=getNode();if(data.type!="homepage"&&tempnode!=null){data.node=tempnode;}
else if(tempnode==null&&(data.type=="article"||data.type=="search")){data.node=1;}
else if(data.type!="checkout"&&data.type!="orderconfirmed"&&data.type!="homepage"){var temprandom=randomIntFromInterval(1,10);if(temprandom<=5)
data.node=11;else
data.node=13;}
try{var tempcontent=tempJQ("#size-guide-overlay-shoes");if(tempcontent!=null&&tempcontent.length==1){if(tempcontent.is(":visible")){if(typeof(data.tags)=="undefined")
data.tags="sizehelpvisible";else
data.tags=data.tags+",sizehelpvisible";}}}
catch(tempex){}
return data;}
catch(ex){if(typeof(console)!="undefined"&&typeof(console.log)!="undefined")
console.log("getViewData error: ",ex);return null;}}
function getNode(){var tempurl=window.location.href;tempurl=tempurl.toLowerCase();var temp_loc=document.location.href.split("://")[1].split("/");var page="";for(var i=1;i<temp_loc.length;i++){if(temp_loc[i]!=null&&temp_loc[i].length>0)
page=temp_loc[i];}
var curpage=page.split("?")[0];curpage=curpage.toLowerCase();var temppage=null;if(curpage.length>3)
temppage=curpage.substr(curpage.length-3);if(tempurl!=null&&tempurl.length>0){if(tempurl.indexOf("/stories")!=-1){return 7;}
else if(tempurl.indexOf("/runway")!=-1||tempurl.indexOf("/shop-the-look")!=-1){return 4;}
else if(tempurl.indexOf("/gifts")!=-1){return 3;}
else if(tempurl.indexOf("/children")!=-1){return 8;}
else if(tempurl.indexOf("/womens-fragrances/")!=-1){return 12;}
else if(tempurl.indexOf("/women")!=-1){return 6;}
else if(tempurl.indexOf("/men")!=-1){return 5;}
else if(tempurl.indexOf("/beauty")!=-1||tempurl.indexOf("/gucci-guilty-fragrance")!=-1){return 12;}
else if(tempurl.indexOf("/jewelry-watches")!=-1||tempurl.indexOf("/jewellery-watches")!=-1){return 2;}}
return null;}
function getPageName(){var content=document.getElementsByTagName("title");if(typeof(content)!="undefined"&&content!=null&&content.length>0){var result=content[0].textContent||content[0].innerText;if(typeof(result)!="undefined"&&result!=null&&result.length>0){if(result.indexOf("| Shop Gucci.com")!=-1){result=result.split("| Shop Gucci.com")[0];}
return myTrim(result);}}
return null;}
function getProductImage(){try{var metaTags=document.getElementsByTagName("meta");var fbAppIdContent="";for(var i=0;i<metaTags.length;i++){if(metaTags[i].getAttribute("property")=="og:image"){fbAppIdContent=metaTags[i].getAttribute("content");return fbAppIdContent;}}}
catch(imageex){}
return null;}
function getLookImage(){try{var tempimg=tempJQ(".main-carousel-shop-the-look .carousel-slide.slick-active .stl-header-image._loaded");if(tempimg!=null&&tempimg.length>0){var tempattr=tempimg[0].getAttribute("data-src");if(tempattr!=null&&tempattr.length>0){return tempattr;}
else{return tempimg[0].src;}}}
catch(imageex){}
return null;}
function getProductName(){try{for(var i=0;i<dataLayer.length;i++){if(typeof(dataLayer[i].ecommerce)!="undefined"&&dataLayer[i].ecommerce!=null&&typeof(dataLayer[i].ecommerce.detail)!="undefined"&&dataLayer[i].ecommerce.detail!=null&&typeof(dataLayer[i].ecommerce.detail.products)!="undefined"&&dataLayer[i].ecommerce.detail.products!=null&&dataLayer[i].ecommerce.detail.products.length>0){return myTrim(dataLayer[i].ecommerce.detail.products[0].name);}}}
catch(tempex){}
return null;}
function getProductPrice(){try{for(var i=0;i<dataLayer.length;i++){if(typeof(dataLayer[i].ecommerce)!="undefined"&&dataLayer[i].ecommerce!=null&&typeof(dataLayer[i].ecommerce.detail)!="undefined"&&dataLayer[i].ecommerce.detail!=null&&typeof(dataLayer[i].ecommerce.detail.products)!="undefined"&&dataLayer[i].ecommerce.detail.products!=null&&dataLayer[i].ecommerce.detail.products.length>0){return dataLayer[i].ecommerce.detail.products[0].price;}}}
catch(tempex){}
return null;}
function getProductSku(){try{for(var i=0;i<dataLayer.length;i++){if(typeof(dataLayer[i].ecommerce)!="undefined"&&dataLayer[i].ecommerce!=null&&typeof(dataLayer[i].ecommerce.detail)!="undefined"&&dataLayer[i].ecommerce.detail!=null&&typeof(dataLayer[i].ecommerce.detail.products)!="undefined"&&dataLayer[i].ecommerce.detail.products!=null&&dataLayer[i].ecommerce.detail.products.length>0){var sku=dataLayer[i].ecommerce.detail.products[0].id;try{sku=sku.replace(/[^a-zA-Z0-9]/g,'');}
catch(skuex){}
return sku;}}}
catch(tempex){}
return null;}
function getCategory(){try{for(var i=0;i<dataLayer.length;i++){if(typeof(dataLayer[i].ecommerce)!="undefined"&&dataLayer[i].ecommerce!=null&&typeof(dataLayer[i].ecommerce.detail)!="undefined"&&dataLayer[i].ecommerce.detail!=null&&typeof(dataLayer[i].ecommerce.detail.products)!="undefined"&&dataLayer[i].ecommerce.detail.products!=null&&dataLayer[i].ecommerce.detail.products.length>0){return dataLayer[i].ecommerce.detail.products[0].category;}}}
catch(tempex){}
return null;}
function getProductSize(){try{var temptext=myTrim(tempJQ("#product-detail-add-to-shopping-bag-form .size-dropdown .content-select .selectric-size-select .selectric > .label").first().text());if(temptext!=null&&temptext.length>0&&temptext.indexOf("Select")!=0){return temptext;}}
catch(tempex){}
return null;}
function getProductSizeAvailable(){try{var tempcontent=tempJQ("#product-detail-add-to-shopping-bag-form .size-dropdown").first();return tempcontent.is(':visible');}
catch(tempex){}
return false;}
function getProductAvailability(){try{return myTrim(tempJQ("#product-detail-add-to-shopping-bag-form .shipping-info ").first().text());}
catch(tempex){}
return null;}
function getOrderData(){try{var data=[];var totalprice=0;var orderId="auto";tempJQ(".header-nav-bag-item").each(function(index){var skus=tempJQ(this).find(".header-nav-bag-item-details")[0].getElementsByTagName("li");var item_name=tempJQ(this).find("strong").text();var img_link=tempJQ(this).find("img")[0].src;var price=tempJQ(this).find(".header-price").text();var decimalSign=getDecimalSign(myTrim(price.replace(/[^\d.,]/g,'')));if(decimalSign==","){price=price.replace(/[.]/g,"");price=price.replace(",",".");}
price=parseFloat(price.replace(/[^0-9\.\-\+]/g,""));var qty=skus[1].innerText||skus[1].textContent;qty=parseFloat(qty.replace(/[^0-9\.\-\+]/g,""));var sku=skus[0].innerText||skus[0].textContent;try{sku=sku.replace(/[^a-zA-Z0-9]/g,'');}
catch(skuex){}
if(sku.indexOf("Stile")==0){sku=sku.split("Stile")[1];}
if(sku.indexOf("Style")==0){sku=sku.split("Style")[1];}
if(sku.indexOf("#")!=-1){sku=sku.split("#")[1];}
sku=sku.replace(/\s+/g,'');totalprice=totalprice+(price*qty);data.push({"action":"addItem","orderId":"auto","name":myTrim(item_name),"price":price,"sku":myTrim(sku),"img":img_link,"qty":qty});});if(data.length>0){data.push({"action":"trackOrder","orderId":orderId,"orderTotal":totalprice});setCookie("inside-ordertotal",totalprice,1);return data;}
return null;}
catch(ex){log("getOrderData error. ",ex);return null;}}
function getOrderDataCart(){try{var data=[];var totalprice=0;var orderId="auto";var templist=tempJQ(".shopping-bag-content .baglist .baglist-item-summary");tempJQ(".shopping-bag-content .baglist .baglist-item-summary").each(function(index){if(!tempJQ(this).find(".baglist-item-removed").first().is(':visible')){var tempdata=tempJQ(this).data();var item_name=tempdata.itemTitle;var img_link=tempJQ(this).find("img")[0].src;var price=tempdata.itemPrice;var decimalSign=getDecimalSign(myTrim(price.replace(/[^\d.,]/g,'')));if(decimalSign==","){price=price.replace(/[.]/g,"");price=price.replace(",",".");}
price=parseFloat(price.replace(/[^0-9\.\-\+]/g,""));var qty=tempdata.itemQuantity;var sku=tempdata.itemBaseproduct;try{sku=sku.replace(/[^a-zA-Z0-9]/g,'');}
catch(skuex){}
var tempcat=tempdata.itemCategory;totalprice=totalprice+(price*qty);try{var temptext=tempJQ(this).find(".baglist-item-availability > .shipping-info > .title").first().text();if(temptext!=null&&myTrim(temptext).length>0){item_name=myTrim(temptext)+": "+item_name;}}
catch(tempex){}
data.push({"action":"addItem","orderId":"auto","name":myTrim(item_name),"price":price,"sku":sku,"img":img_link,"category":myTrim(tempcat),"qty":qty});}});if(data.length>0){try{var tempcontent=tempJQ(".order-details-totals-total");if(tempcontent!=null&&tempcontent.length==1){var temptext=tempcontent.text();if(temptext!=null&&temptext.length>0){var decimalSign=getDecimalSign(myTrim(temptext.replace(/[^\d.,]/g,'')));if(decimalSign==","){temptext=temptext.replace(/[.]/g,"");temptext=temptext.replace(",",".");}
totalprice=parseFloat(temptext.replace(/[^0-9\.\-\+]/g,""));}}}
catch(tempex){}
data.push({"action":"trackOrder","orderId":orderId,"orderTotal":totalprice});setCookie("inside-ordertotal",totalprice,1);return data;}
return null;}
catch(ex){log("getOrderDataCart error. ",ex);return null;}}
function getOrderDataCheckout(){try{var data=[];var totalprice=0;var orderId="auto";var tempdetails=null;for(var i=0;i<dataLayer.length;i++){if(typeof(dataLayer[i])!="undefined"&&dataLayer[i]!=null&&typeof(dataLayer[i].ecommerce)!="undefined"&&dataLayer[i].ecommerce!=null&&typeof(dataLayer[i].ecommerce.products)!="undefined"&&dataLayer[i].ecommerce.products!=null){tempdetails=dataLayer[i].ecommerce.products;}}
tempJQ(".order-details-product-list:first .order-details-product-item").each(function(index){var item_name=tempJQ(this).find(".order-details-product-item-title").text();var img_link=tempJQ(this).find("img")[0].src;var price=tempJQ(this).find(".order-details-product-item-price").text();var decimalSign=getDecimalSign(myTrim(price.replace(/[^\d.,]/g,'')));if(decimalSign==","){price=price.replace(/[.]/g,"");price=price.replace(",",".");}
price=parseFloat(price.replace(/[^0-9\.\-\+]/g,""));var qty=tempJQ(this).find(".order-details-product-item-quantity").text();qty=parseFloat(qty.replace(/[^0-9\.\-\+]/g,""));var sku=tempJQ(this).find(".order-details-product-item-reference").text();try{sku=sku.replace(/[^a-zA-Z0-9]/g,'');}
catch(skuex){}
if(sku.indexOf("Stile")==0){sku=sku.split("Stile")[1];}
if(sku.indexOf("Style")==0){sku=sku.split("Style")[1];}
if(sku.indexOf("#")!=-1){sku=sku.split("#")[1];}
if(tempdetails!=null&&tempdetails.length>index){sku=tempdetails[index].id;try{sku=sku.replace(/[^a-zA-Z0-9]/g,'');}
catch(skuex){}
price=parseFloat(tempdetails[index].price);qty=parseFloat(tempdetails[index].quantity);item_name=tempdetails[index].name;if(typeof(tempdetails[index].variant)!="undefined"&&tempdetails[index].variant!=null&&tempdetails[index].variant.length>0){item_name=tempdetails[index].variant;}
totalprice=totalprice+(price*qty);}
else{totalprice=totalprice+price;price=price/qty;}
try{var temptext=tempJQ(this).find(".shipping-info-and-price > .shipping-info > .title").first().text();if(temptext!=null&&myTrim(temptext).length>0){item_name=myTrim(temptext)+": "+item_name;}}
catch(tempex){}
data.push({"action":"addItem","orderId":"auto","name":myTrim(item_name),"price":price,"sku":myTrim(sku),"img":img_link,"qty":qty});if(tempdetails!=null&&tempdetails.length>index){data[index].category=tempdetails[index].category;}});if(data.length>0){try{var tempcontent=tempJQ(".order-details-totals-total");if(tempcontent!=null&&tempcontent.length>0){var temptext=tempcontent.first().text();if(temptext!=null&&temptext.length>0){var decimalSign=getDecimalSign(myTrim(temptext.replace(/[^\d.,]/g,'')));if(decimalSign==","){temptext=temptext.replace(/[.]/g,"");temptext=temptext.replace(",",".");}
totalprice=parseFloat(temptext.replace(/[^0-9\.\-\+]/g,""));}}}
catch(tempex){}
try{for(var i=0;i<dataLayer.length;i++){if(typeof(dataLayer[i].ecommerce)!="undefined"&&dataLayer[i].ecommerce!=null&&typeof(dataLayer[i].ecommerce.products)!="undefined"&&dataLayer[i].ecommerce.products!=null&&dataLayer[i].ecommerce.products.length>0&&typeof(dataLayer[i]["cart total"])!="undefined"&&dataLayer[i]["cart total"]!=null){totalprice=dataLayer[i]["cart total"];break;}}}
catch(tempex){}
data.push({"action":"trackOrder","orderId":orderId,"orderTotal":totalprice});setCookie("inside-ordertotal",totalprice,1);return data;}
return null;}
catch(ex){log("getOrderDataCheckout error. ",ex);return null;}}
function getOrderDataCheckoutJS(){try{var data=[];var totalprice=0;var tables=null;if(typeof(dataLayer)!="undefined"&&dataLayer!=null&&dataLayer.length>0){for(var i=0;i<dataLayer.length;i++){if(typeof(dataLayer[i].ecommerce)!="undefined"&&dataLayer[i].ecommerce!=null&&typeof(dataLayer[i].ecommerce.products)!="undefined"&&dataLayer[i].ecommerce.products!=null&&dataLayer[i].ecommerce.products.length>0){tables=dataLayer[i].ecommerce.products;break;}}}
if(tables!=null&&tables.length>0){for(var i=0;i<tables.length;i++){var row=tables[i];var item_name=row.name;var sku=row.id;try{sku=sku.replace(/[^a-zA-Z0-9]/g,'');}
catch(skuex){}
var tempcat=row.category;var price=row.price;price=parseFloat(price);var qty=row.quantity;totalprice=totalprice+(price*qty);data.push({"action":"addItem","orderId":"auto","name":myTrim(item_name),"price":price,"sku":myTrim(sku),"category":myTrim(tempcat),"qty":qty});}
if(data.length>0){try{for(var i=0;i<dataLayer.length;i++){if(typeof(dataLayer[i].ecommerce)!="undefined"&&dataLayer[i].ecommerce!=null&&typeof(dataLayer[i].ecommerce.products)!="undefined"&&dataLayer[i].ecommerce.products!=null&&dataLayer[i].ecommerce.products.length>0&&typeof(dataLayer[i]["cart total"])!="undefined"&&dataLayer[i]["cart total"]!=null){totalprice=dataLayer[i]["cart total"];break;}}}
catch(tempex){}
data.push({"action":"trackOrder","orderId":"auto","orderTotal":totalprice});setCookie("inside-ordertotal",totalprice,1);return data;}}
return null;}
catch(ex){log("getOrderDataCheckoutJS error. ",ex);return null;}}
function checkCart(){try{var tempcount=tempJQ(".shopping-bag-product-count").text();if(tempcount!=null&&tempcount.length>0){tempcount=tempcount.replace(/[^\d.]/g,'');return parseFloat(tempcount);}}
catch(numex){}
return 0;}
function orderConfirmProcess(){try{var data=[];var detail=null;if(typeof(dataLayer)!="undefined"&&dataLayer!=null&&dataLayer.length>0){for(var i=0;i<dataLayer.length;i++){if(typeof(dataLayer[i].ecommerce)!="undefined"&&dataLayer[i].ecommerce!=null&&typeof(dataLayer[i].ecommerce.purchase)!="undefined"&&dataLayer[i].ecommerce.purchase!=null&&typeof(dataLayer[i].ecommerce.purchase.actionField)!="undefined"&&dataLayer[i].ecommerce.purchase.actionField!=null&&typeof(dataLayer[i].ecommerce.purchase.actionField.id)!="undefined"&&dataLayer[i].ecommerce.purchase.actionField.id!=null&&dataLayer[i].ecommerce.purchase.actionField.id.length>0){detail=dataLayer[i].ecommerce.purchase;}}}
if(detail!=null){var totalprice=detail.actionField.revenue;var orderID=detail.actionField.id;try{var lastOrderID=sessionStorage.getItem("insidelastorderid");if(lastOrderID==orderID){return null;}}
catch(numex){}
try{if(typeof(detail.actionField.tax)!="undefined"&&detail.actionField.tax!=null){if(typeof totalprice==='string'||totalprice instanceof String)
totalprice=parseFloat(totalprice);if(typeof detail.actionField.tax==='string'||detail.actionField.tax instanceof String)
totalprice=totalprice+parseFloat(detail.actionField.tax);else
totalprice=totalprice+detail.actionField.tax;}}
catch(tempex){}
if(typeof(orderID)!="undefined"&&orderID!=null&&orderID.length>0&&orderID!="auto"){var tempdata={};try{for(var key in detail.actionField){if(detail.actionField.hasOwnProperty(key)){if(detail.actionField[key]!=null){if(typeof detail.actionField[key]==='string'||detail.actionField[key]instanceof String){if(detail.actionField[key].length>0)
tempdata[key]=encodeURIComponent(detail.actionField[key]);}
else if(isNumeric(detail.actionField[key])){tempdata[key]=detail.actionField[key];}
else if(typeof(detail.actionField[key])==typeof(true)){tempdata[key]=detail.actionField[key];}}}}}
catch(tempex){}
data.push({"action":"trackOrder","orderId":"auto","newOrderId":orderID,"orderTotal":totalprice,"data":tempdata,"update":true,"complete":true});}
return data;}
return null;}
catch(ex){log("orderConfirmProcess error. ",ex);return null;}}
function getVisitorId(){try{if(typeof(curvisitorobj)!="undefined"&&curvisitorobj!=null&&typeof(curvisitorobj.uid)!="undefined"&&curvisitorobj.uid!=null&&curvisitorobj.uid.length>0)
return curvisitorobj.uid;}
catch(visitidex){}
return null;}
function getVisitorName(){try{if(typeof(curvisitorobj)!="undefined"&&curvisitorobj!=null&&typeof(curvisitorobj.name)!="undefined"&&curvisitorobj.name!=null&&curvisitorobj.name.length>0)
return curvisitorobj.name}
catch(visitidex){}
return "";}
function insertInsideTag(){if(typeof(_insideGraph)!="undefined"&&_insideGraph!=null){_insideGraph.processQueue();}
else{var inside=document.createElement('script');inside.type='text/javascript';inside.async=true;inside.src=('https:'==document.location.protocol?'https://':'http://')+trackerURL+'/ig.js';var s=document.getElementsByTagName('script')[0];s.parentNode.insertBefore(inside,s);}}
function sendToInside(){try{var visitorId=getVisitorId();var visitorName=getVisitorName();if(typeof(_insideGraph)=="undefined"||_insideGraph==null){if(visitorId!=null&&visitorId.length>0&&visitorName!=null&&visitorName.length>0){_inside.push({"action":"getTracker","account":accountKey,"visitorId":visitorId,"visitorName":visitorName});}
else if(visitorId!=null&&visitorId.length>0){_inside.push({"action":"getTracker","account":accountKey,"visitorId":visitorId});}
else if(visitorName!=null&&visitorName.length>0){_inside.push({"action":"getTracker","account":accountKey,"visitorName":visitorName});}
else{_inside.push({"action":"getTracker","account":accountKey});}}
else{if(visitorId!=null&&visitorId.length>0){_insideGraph.current.visitorId=visitorId;}
if(visitorName!=null&&visitorName.length>0){_insideGraph.current.visitorName=visitorName;}
_insideGraph.current.url=window.location.href;}
var view=getViewData();if(view!=null){if(view.type=="orderconfirmed"){var tempconfirm=orderConfirmProcess();if(tempconfirm!=null&&tempconfirm.length>0){for(var i=0;i<tempconfirm.length;i++){_inside.push(tempconfirm[i]);try{if(tempconfirm[i].action=="trackOrder")
sessionStorage.setItem("insidelastorderid",tempconfirm[i].newOrderId);}
catch(tempex){}}}
_inside.push(view);deleteCookie("inside-ordertotal");}
else{_inside.push(view);var orderData=getOrderData();if(useCustomFunctionForCheckout&&view.type=="checkout"){orderData=getOrderDataCheckout();if(orderData==null||orderData.length==0){orderData=getOrderDataCart();if(orderData==null||orderData.length==0){orderData=getOrderDataCheckoutJS();}}}
if(orderData!=null&&orderData.length>0){for(var i=0;i<orderData.length;i++){_inside.push(orderData[i]);if(orderData[i].action=="trackOrder"){view.orderId=orderData[i].orderId;view.orderTotal=orderData[i].orderTotal;insideOrderTotal=orderData[i].orderTotal;}}}
else if(view.type=="checkout"&&view.url.indexOf("/cart")!=-1){deleteCookie("inside-ordertotal");}
else if(checkCart()>0){var total_temp=getCookie("inside-ordertotal");try{total_temp=parseFloat(total_temp);}
catch(numex){total_temp=0;}
if(total_temp!=null&&total_temp>0){view.orderId="auto";view.orderTotal=total_temp;}}}
log("Inside Debug: ",_inside);}}
catch(sendex){_inside=[];_inside.push({"action":"getTracker","account":accountKey});_inside.push({"action":"trackView","type":"other","name":"Check: "+window.location.href});log(sendex);}
insertInsideTag();if(!firstCall)
firstCall=true;}
function startInside(){var tempview=getViewData();if(tempview!=null&&typeof(tempview.type)!="undefined"&&tempview.type!=null&&tempview.type=="orderconfirmed"){deferWait(sendToInside,function(){var tempconfirm=orderConfirmProcess();if(tempconfirm!=null&&tempconfirm.length>0){return true;}
return false;});}
else{deferWait(sendToInside,function(){if(document.readyState!='loading'&&document.readyState!='interactive'){var curtempview=getViewData();keepWait(sendToInside,function(){if(!firstCall)
return false;if(typeof(_insideGraph)!="undefined"&&_insideGraph!=null){var temporderdata=getOrderData();if(useCustomFunctionForCheckout&&tempview.type=="checkout"){temporderdata=getOrderDataCheckout();if(temporderdata==null||temporderdata.length==0){temporderdata=getOrderDataCart();if(temporderdata==null||temporderdata.length==0){temporderdata=getOrderDataCheckoutJS();}}
log(temporderdata);}
if(temporderdata!=null&&temporderdata.length>0){for(var i=0;i<temporderdata.length;i++){if(temporderdata[i].action=="trackOrder"){if(insideOrderTotal!=temporderdata[i].orderTotal){return true;}}}}
else if(insideOrderTotal>0){insideOrderTotal=0;return true;}}
return false;});if(curtempview.type=="product"){keepWait(sendToInside,function(){if(!firstCall)
return false;var tempcurview=getViewData();if(typeof(_insideGraph)!="undefined"&&_insideGraph!=null){if(typeof(tempcurview.data)!="undefined"&&tempcurview.data!=null&&typeof(tempcurview.data.size)!="undefined"&&tempcurview.data.size!=null&&tempcurview.data.size.length>0&&tempcurview.data.size!=cursize){cursize=tempcurview.data.size;return true;}}
return false;});keepWait(sendToInside,function(){if(!firstCall)
return false;if(typeof(_insideGraph)!="undefined"&&_insideGraph!=null){var tempcontent=tempJQ("#size-guide-overlay-shoes");if(tempcontent!=null&&tempcontent.length==1){if(tempcontent.is(":visible")&&!sizevisible){sizevisible=true;return true;}
else if(!tempcontent.is(":visible")&&sizevisible){sizevisible=false;return true;}}}
return false;});}
return true;}
return false;});}}
function initializeInside(){_inside.push({"action":"getTracker","account":accountKey});insertInsideTag();}
if(window.location.href.indexOf("inside_testing")!=-1){if(typeof(_insideGraph)=="undefined"||_insideGraph==null){initializeInside();}
deferWait(startInside,function(){if(typeof(_insideGraph)!="undefined"&&_insideGraph!=null&&typeof(_insideGraph.jQuery)!="undefined"&&_insideGraph.jQuery!=null&&typeof(_insideGraph.current)!="undefined"&&_insideGraph.current!=null&&typeof(_insideGraph.current.url)!="undefined"&&_insideGraph.current.url!=null){if(tempJQ==null){tempJQ=_insideGraph.jQuery;}
return true;}
return false;});}
else if(window.location.href.indexOf("no_inside")!=-1){return;}
else{if(typeof(_insideGraph)=="undefined"||_insideGraph==null){deferWait(initializeInside,function(){if(document.readyState!='loading'&&document.readyState!='interactive'){return true;}
return false;});}
deferWait(startInside,function(){if(typeof(_insideGraph)!="undefined"&&_insideGraph!=null&&typeof(_insideGraph.jQuery)!="undefined"&&_insideGraph.jQuery!=null&&typeof(_insideGraph.current)!="undefined"&&_insideGraph.current!=null&&typeof(_insideGraph.current.url)!="undefined"&&_insideGraph.current.url!=null){if(tempJQ==null){tempJQ=_insideGraph.jQuery;}
return true;}
return false;});}})();