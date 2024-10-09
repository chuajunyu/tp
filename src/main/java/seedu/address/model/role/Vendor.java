package seedu.address.model.role;

/**
 * Represents a Vendor in the event.
 */
public class Vendor extends Role {
    public static final String MESSAGE_CONSTRAINTS = "Vendors should be alphanumeric";

    public static final String ROLE_WORD = "vendor";

    public Vendor() {
        super("vendor");
    }


}
