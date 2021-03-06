package com.ascland.chapter02;

//@Named
//@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    //构造器注解
//  @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    //set方法注解
//  @Autowired
//  public void setCompactDisc(CompactDisc cd) {
//    this.cd = cd;
//  }

//  @Autowired(required = false)
//  public void setCompactDisc(CompactDisc cd) {
//    this.cd = cd;
//  }

//  @Inject
//  public void setCompactDisc(CompactDisc cd) {
//    this.cd = cd;
//  }

    public void play() {
        cd.play();
    }

}
