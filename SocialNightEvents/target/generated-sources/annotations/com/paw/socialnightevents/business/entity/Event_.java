package com.paw.socialnightevents.business.entity;

import com.paw.socialnightevents.business.entity.Client;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.primefaces.model.UploadedFile;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-12T15:19:11")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile SingularAttribute<Event, String> Description;
    public static volatile SingularAttribute<Event, Long> id;
    public static volatile ListAttribute<Event, Client> clientList;
    public static volatile SingularAttribute<Event, String> MusicType;
    public static volatile SingularAttribute<Event, UploadedFile> Image;
    public static volatile SingularAttribute<Event, Date> Date;
    public static volatile SingularAttribute<Event, Float> EntryPrice;
    public static volatile SingularAttribute<Event, String> Name;

}