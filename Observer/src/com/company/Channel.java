package com.company;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private List<Subscriber> subs = new ArrayList<>();
    private String title;

    public  void subscribe(Subscriber sub){
        subs.add(sub);
    }

    public void unsSubscribe( Subscriber sub)
    {
        subs.remove(sub);
    }

    public void notifySubsribers()
    {
        for(Subscriber sub : subs)
        {
            sub.update();
        }
    }

    public void upload(String title)
    {
        this.title = title;
        notifySubsribers();
    }
}
