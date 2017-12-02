void setup(){
  background(100,100,100);
  size(1000,500);
}
boolean r;
int x=800;

int x1=200;
int y= 250;

void draw(){
  noFill();
  background(100,100,100);
  
  if(x1>800){
  r= true;
  }
   if(r==true){  
    x1=x1-2;
  }
  
  
  if(x1<200){
  r= false;
  }
   if(r==false){  
    x1=x1+2;
  }
  
  if(x1<200){
  r= true;
  }
   if(r==true){  
    x=x+2;
  }
  
  
  if(x1>800){
  r= false;
  }
   if(r==false){  
    x=x-2;
  }
  for(int i=0;i<400; i++){
    if(i%10 == 0){
   ellipse(x,y,400-i,400-i);
    
    }
   if(i%10 == 0){
   ellipse(x1,y,400-i,400-i);
   
    }

}}
