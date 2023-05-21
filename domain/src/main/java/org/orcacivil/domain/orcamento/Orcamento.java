package org.orcacivil.domain.orcamento;

import jdk.jfr.Category;
import org.orcacivil.domain.AggregateRoot;

import java.time.Instant;
import java.util.UUID;

public class Orcamento extends AggregateRoot<OrcamentoID> {

    private String name;
    private boolean active;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deletedAt;

    public Orcamento(OrcamentoID id, String name, boolean active, Instant createdAt, Instant updatedAt, Instant deletedAt) {
        super(id);
        this.name = name;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public static Orcamento newOrcamento(final String name, final boolean active){
        final var id = OrcamentoID.unique();
        return new Orcamento(id, name,active,Instant.now(), Instant.now(), null);
    }

    public OrcamentoID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Instant deletedAt) {
        this.deletedAt = deletedAt;
    }
}