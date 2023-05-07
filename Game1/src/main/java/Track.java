/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author star_
 */
public class Track implements LayoutStrategy {

    LayoutStrategy layoutStrategy;

    public Track(LayoutStrategy layoutStrategy) {
        this.layoutStrategy = layoutStrategy;
    }

    public void setLayoutStrategy(LayoutStrategy layoutStrategy) {
        this.layoutStrategy = layoutStrategy;
    }

    //  building track to a LayoutStrategy object
    public void build() {
        layoutStrategy.build();
    }
}
