package br.com.gwcloud.smartplace.pilot.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
public class AbstractBaseEntity implements Serializable {

    private static final long serialVersionUID = -6556453805270108437L;
    @Id
    @GeneratedValue
    private UUID id;

    public AbstractBaseEntity() {
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
