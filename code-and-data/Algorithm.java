public abstract class Algorithm{
  Path path;
  public Algorithm(Path path){
    this.path = path;
  }
  public Algorithm(Point[] points){
    this.path = new Path(points);
  }
  public void RunAlgorithm(){}
  
  //We should be able to implement this here rather than wasting time at each time
  public void Save(){ 
  }
  public void RunNTimes(long n){}
}
