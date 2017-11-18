void setup(){
  background(100,100,100);
  size(1000,500);
}

int x=800;

int x1=200;
int y= 250;

void draw(){
  noFill();
  background(100,100,100);
  x=x-1;
  x1=x1+1;
  for(int i=0;i<400; i++){
    if(i%10 == 0){
   ellipse(x,y,400-i,400-i);
    
    }
 
    
     if(i%10 == 0){
   ellipse(x1,y,400-i,400-i);
    }

}}