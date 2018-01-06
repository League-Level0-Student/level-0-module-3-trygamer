void setup(){
  size(1000,1000);
}

void draw(){
for(int i=800; i>100;i-=100){ 
    if(i%200==0){
   fill(255,000,000);
  }else{
    fill(255,255,255);
 }
   ellipse(500,500, i-100,i-100);
}
}