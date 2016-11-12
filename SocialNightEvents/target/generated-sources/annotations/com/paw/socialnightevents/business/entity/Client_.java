package com.paw.socialnightevents.business.entity;

import com.paw.socialnightevents.business.entity.Event;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-11-12T15:19:11")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> Email;
    public static volatile ListAttribute<Client, Event> eventList;
    public static volatile SingularAttribute<Client, String> FirstName;
    public static volatile SingularAttribute<Client, Integer> PhoneNumber;
    public static volatile SingularAttribute<Client, Long> id;
    public static volatile SingularAttribute<Client, String> LastName;

}