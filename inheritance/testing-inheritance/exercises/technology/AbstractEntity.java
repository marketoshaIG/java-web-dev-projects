import java.util.UUID;


public abstract class AbstractEntity {

    private static int idCounter = 0;
    private UUID id;

    public AbstractEntity() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

}
