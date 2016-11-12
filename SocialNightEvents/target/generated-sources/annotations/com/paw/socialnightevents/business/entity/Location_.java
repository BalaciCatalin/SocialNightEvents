package com.paw.socialnightevents.business.entity;

import com.paw.socialnightevents.business.entity.Event;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-12T15:19:11")
@StaticMetamodel(Location.class)
public class Location_ { 

    public static volatile SingularAttribute<Location, String> Description;
    public static volatile ListAttribute<Location, Event> eventList;
    public static volatile SingularAttribute<Location, String> Street;
    public static volatile SingularAttribute<Location, Integer> PhoneNumber;
    public static volatile SingularAttribute<Location, Long> id;
    public static volatile SingularAttribute<Location, String> City;
    public static volatile SingularAttribute<Location, String> Name;

}