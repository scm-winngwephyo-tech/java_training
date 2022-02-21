package scm.bulletin.board.system.bl.dto.search;

import java.io.Serializable;

import scm.bulletin.board.system.persistence.entity.user.User;

/**
 * <h2>SearchDTO Class</h2>
 * <p>
 * Process for Displaying SearchDTO
 * </p>
 * 
 * @author WinNgwePhyo
 *
 */
public class SearchDTO implements Serializable {
    /**
     * <h2>serialVersionUID</h2>
     * <p>
     * serialVersionUID
     * </p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <h2>name</h2>
     * <p>
     * name
     * </p>
     */
    private String name;
    /**
     * <h2>email</h2>
     * <p>
     * email
     * </p>
     */
    private String email;
    /**
     * <h2>createdFrom</h2>
     * <p>
     * createdFrom
     * </p>
     */

    private String createdFrom;
    /**
     * <h2>createdTo</h2>
     * <p>
     * createdTo
     * </p>
     */

    private String createdTo;

    /**
     * <h2>getName</h2>
     * <p>
     * Getter Method for User Name
     * </p>
     *
     * @return
     * @return String
     */

    public String getName() {
        return name;
    }

    /**
     * <h2>setName</h2>
     * <p>
     * Setter Method for User Name
     * </p>
     *
     * @param name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <h2>getEmail</h2>
     * <p>
     * Getter Method for User Email
     * </p>
     *
     * @return
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * <h2>setEmail</h2>
     * <p>
     * Setter Method for User Email
     * </p>
     *
     * @param email
     * @return void
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <h2>getCreatedFrom</h2>
     * <p>
     * Getter Method for User Created From
     * </p>
     *
     * @return
     * @return String
     */
    public String getCreatedFrom() {
        return createdFrom;
    }

    /**
     * <h2>setCreatedFrom</h2>
     * <p>
     * Setter Method for User Created From
     * </p>
     *
     * @param createdFrom
     * @return void
     */
    public void setCreatedFrom(String createdFrom) {
        this.createdFrom = createdFrom;
    }

    /**
     * <h2>getCreatedTo</h2>
     * <p>
     * Getter Method for User Created To
     * </p>
     *
     * @return
     * @return String
     */
    public String getCreatedTo() {
        return createdTo;
    }

    /**
     * <h2>setCreatedTo</h2>
     * <p>
     * Setter Method for User Created To
     * </p>
     *
     * @param createdTo
     * @return void
     */
    public void setCreatedTo(String createdTo) {
        this.createdTo = createdTo;
    }

    /**
     * <h2>Constructor for SearchDTO</h2>
     * <p>
     * Constructor for SearchDTO
     * </p>
     * 
     * @param user
     */
    public SearchDTO(User user) {
        super();
        this.name = user.getName();
        this.email = user.getEmail();
        this.createdFrom = String.valueOf(user.getCreatedAt());
        this.createdTo = String.valueOf(user.getCreatedAt());
    }

    /**
     * <h2>Constructor for SearchDTO</h2>
     * <p>
     * Constructor for SearchDTO
     * </p>
     */
    public SearchDTO() {

    }

}
