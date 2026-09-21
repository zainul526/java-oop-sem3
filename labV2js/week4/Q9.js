const year = 2020;
if((year%400==0)||(year%4==0 && year%100!=0)){
    console.log("Year is leap");
}
else {
    console.log("Not a Leap year")
}
    