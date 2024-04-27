/*
 * This file is generated by jOOQ.
 */
package com.chatcode.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LoggedIn implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;
    private final Long userId;
    private final Long version;
    private final LocalDateTime dateCreated;
    private final String remoteAddr;

    public LoggedIn(LoggedIn value) {
        this.id = value.id;
        this.userId = value.userId;
        this.version = value.version;
        this.dateCreated = value.dateCreated;
        this.remoteAddr = value.remoteAddr;
    }

    public LoggedIn(
        Long id,
        Long userId,
        Long version,
        LocalDateTime dateCreated,
        String remoteAddr
    ) {
        this.id = id;
        this.userId = userId;
        this.version = version;
        this.dateCreated = dateCreated;
        this.remoteAddr = remoteAddr;
    }

    /**
     * Getter for <code>logged_in.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Getter for <code>logged_in.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>logged_in.version</code>.
     */
    public Long getVersion() {
        return this.version;
    }

    /**
     * Getter for <code>logged_in.date_created</code>.
     */
    public LocalDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Getter for <code>logged_in.remote_addr</code>.
     */
    public String getRemoteAddr() {
        return this.remoteAddr;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final LoggedIn other = (LoggedIn) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!this.userId.equals(other.userId))
            return false;
        if (this.version == null) {
            if (other.version != null)
                return false;
        }
        else if (!this.version.equals(other.version))
            return false;
        if (this.dateCreated == null) {
            if (other.dateCreated != null)
                return false;
        }
        else if (!this.dateCreated.equals(other.dateCreated))
            return false;
        if (this.remoteAddr == null) {
            if (other.remoteAddr != null)
                return false;
        }
        else if (!this.remoteAddr.equals(other.remoteAddr))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.version == null) ? 0 : this.version.hashCode());
        result = prime * result + ((this.dateCreated == null) ? 0 : this.dateCreated.hashCode());
        result = prime * result + ((this.remoteAddr == null) ? 0 : this.remoteAddr.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LoggedIn (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(version);
        sb.append(", ").append(dateCreated);
        sb.append(", ").append(remoteAddr);

        sb.append(")");
        return sb.toString();
    }
}