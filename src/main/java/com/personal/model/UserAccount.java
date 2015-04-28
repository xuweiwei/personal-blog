package com.personal.model;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonView;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserAccount implements  Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8298270604938901589L;
	public final static int STATUS_NOT_ACTIVATED = 0;
	public final static int STATUS_NORMAL = 1;
	public final static int STATUS_DISABLED = 2;
	
	public final static int TYPE_PERSONAGE = 1;
	public final static int TYPE_COMPANY=2;
	
	public final static String SOURCE_TYPE_EDU= "edu";
	
	private Long userId;

    private String userName;

    private String password;

    private Integer userType;

    private String email;

    private String mobile;
    
    private String realName;
    
    private String pinyin;

    private Date createTime;

    private Date lastLoginTime;

    private String lastIp;

    private Integer loginCount;

    private Date errorTime;

    private Integer errorCount;

    private String errorIp;

    private Integer status; //如果 status 为 null， 就当成未激活处理
   
    
    private Boolean emailVerify;

    private Boolean mobileVerify;
    
    private String sourceType;

    private String sourceTag;

    private String inviteCode;
    
    public interface BaseView {};
	public interface FullView extends BaseView {};
	public interface WithPasswordView extends FullView {};
    
    public UserAccount() {
		super();
	}
    
    @JsonView(FullView.class)
	public Boolean getEmailVerify() {
		return emailVerify;
	}

	public void setEmailVerify(Boolean emailVerify) {
		this.emailVerify = emailVerify;
	}

	@JsonView(FullView.class)
	public Boolean getMobileVerify() {
		return mobileVerify;
	}

	public void setMobileVerify(Boolean mobileVerify) {
		this.mobileVerify = mobileVerify;
	}

	public UserAccount(Long userId) {
		super();
		this.userId = userId;
	}
    
    public UserAccount(Long userId, String realName) {
		super();
		this.userId = userId;
		this.realName = realName;
	}
    
    public UserAccount(Long userId, String realName, String email, String mobile) {
		super();
		this.userId = userId;
		this.realName = realName;
		this.email = email;
		this.mobile = mobile;
	}
    
    public void init() {
		if(getLoginCount()==null){
			setLoginCount(0);
		}
		if(getErrorCount()==null){
			setErrorCount(0);
		}
	}
    
 
  

	@JsonView(BaseView.class)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @JsonView(FullView.class)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
    
    @JsonView(WithPasswordView.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @JsonView(FullView.class)
    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @JsonView(BaseView.class)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    @JsonView(FullView.class)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    @JsonView(BaseView.class)
    public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();		
	}
	
	@JsonView(BaseView.class)
	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	@JsonView(FullView.class)
	public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @JsonView(BaseView.class)
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @JsonView(FullView.class)
    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    @JsonView(FullView.class)
    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    @JsonView(FullView.class)
    public Date getErrorTime() {
        return errorTime;
    }

    public void setErrorTime(Date errorTime) {
        this.errorTime = errorTime;
    }

    @JsonView(FullView.class)
    public Integer getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    @JsonView(FullView.class)
    public String getErrorIp() {
        return errorIp;
    }

    public void setErrorIp(String errorIp) {
        this.errorIp = errorIp == null ? null : errorIp.trim();
    }

    @JsonView(FullView.class)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
   public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    public String getSourceTag() {
        return sourceTag;
    }

    public void setSourceTag(String sourceTag) {
        this.sourceTag = sourceTag == null ? null : sourceTag.trim();
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }
}