package HibernateDao;

import java.util.HashSet;
import java.util.Set;

/**
 * Actionmaster generated by MyEclipse Persistence Tools
 */

public class Actionmaster implements java.io.Serializable {

    // Fields

    private String actionId;

    private String actionDesc;

    private String actionGroup;

    private Set roleactions = new HashSet(0);

    // Constructors

    /**
     * default constructor
     */
    public Actionmaster() {
    }

    /**
     * minimal constructor
     */
    public Actionmaster(String actionId, String actionDesc) {
        this.actionId = actionId;
        this.actionDesc = actionDesc;
    }

    /**
     * full constructor
     */
    public Actionmaster(String actionId, String actionDesc, String actionGroup,
                        Set roleactions) {
        this.actionId = actionId;
        this.actionDesc = actionDesc;
        this.actionGroup = actionGroup;
        this.roleactions = roleactions;
    }

    // Property accessors

    public String getActionId() {
        return this.actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getActionDesc() {
        return this.actionDesc;
    }

    public void setActionDesc(String actionDesc) {
        this.actionDesc = actionDesc;
    }

    public String getActionGroup() {
        return this.actionGroup;
    }

    public void setActionGroup(String actionGroup) {
        this.actionGroup = actionGroup;
    }

    public Set getRoleactions() {
        return this.roleactions;
    }

    public void setRoleactions(Set roleactions) {
        this.roleactions = roleactions;
    }

}