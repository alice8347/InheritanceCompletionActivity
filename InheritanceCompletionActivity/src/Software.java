
public final class Software extends Product {
    private String programmer;
    private String platform; //linux, mac, or pc
    private String os;
    
    public Software() {
    	super();
    	count++;
    }

	public String getProgrammer() {
		return programmer;
	}

	public void setProgrammer(String programmer) {
		this.programmer = programmer;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
    
	@Override
    public String getDisplayText()
    {
        return super.toString() + "Programmer:  " + programmer + "\n" +
               "platform:    " + platform + "\n" +
        	   "OS:          " + os + "\n";
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Software other = (Software) obj;
		
		if (os == null) {
			if (other.os != null) {
				return false;
			}
		} else if (!os.equals(other.os)) {
			return false;
		}
		if (platform == null) {
			if (other.platform != null) {
				return false;
			}
		} else if (!platform.equals(other.platform)) {
			return false;
		}
		if (programmer == null) {
			if (other.programmer != null) {
				return false;
			}
		} else if (!programmer.equals(other.programmer)) {
			return false;
		}
		return true;
	}
	
}