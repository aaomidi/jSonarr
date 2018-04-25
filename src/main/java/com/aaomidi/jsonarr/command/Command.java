package com.aaomidi.jsonarr.command;

import lombok.Data;

import java.time.Period;
import java.util.Date;

@Data
public class Command {

    //FIXME it seems like the Object body is the payload sent to Sonarr. The other fields are just internal?

    private final String name;
    private final String message;
    private final Object body;
    //TODO add CommandPriority priority;
    //TODO add CommandStatus status;
    private final Date queued;
    private final Date started;
    private final Date ended;
    private final Period duration; //TODO check whether this correctly fits C# TimeSpan - maybe find alternative?
    private final String exception;
    //TODO add CommandTrigger trigger;

}
