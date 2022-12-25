package ma.enset.radarservice.radarCommand.aggregates;

import ma.enset.commonapi.Commands.CreateRadarCommand;
import ma.enset.commonapi.Commands.UpdateRadarCommand;
import ma.enset.commonapi.events.RadarCreatedEvent;
import ma.enset.commonapi.events.RadarUpdatedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class RadarAggregate {
    @AggregateIdentifier
    private  String id ;
    private double MaxVitesse ;
    private double longtitude ;
    private  double latitude ;

    public RadarAggregate() {
    }

    @CommandHandler
    public RadarAggregate(CreateRadarCommand command){
        if(command.getMaxVitesse()<0){
            throw  new RuntimeException("La vitesse doit être possitive");
        }
        AggregateLifecycle.apply(new RadarCreatedEvent(
                command.getId(),
                command.getMaxVitesse(),
                command.getLongtitude(),
                command.getLatitude()
        ));
    }

    @EventSourcingHandler
    public void on(RadarCreatedEvent event) {
        this.id = event.getId();
        this.MaxVitesse = event.getMaxVitesse();
        this.longtitude = event.getLongtitude();
        this.latitude = event.getLatitude();
    }

    @CommandHandler
    public void handle(UpdateRadarCommand command) {
        AggregateLifecycle.apply(new RadarUpdatedEvent(
                command.getId(),
                command.getMaxVitesse(),
                command.getLongtitude(),
                command.getLatitude()
        ));
    }

    @EventSourcingHandler
    public void on(RadarUpdatedEvent event) {
        this.MaxVitesse = event.getMaxVitesse();
        this.longtitude = event.getLongtitude();
        this.latitude = event.getLatitude();
    }



}
