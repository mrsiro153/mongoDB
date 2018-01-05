package mongoDB.tableMongo.txn;

public class BankBranch {
    public static final String name ="bankBranch";
    private String branchID;
    private String branchName;
    private String cityCode;
    private String bankCode;
    private String branchCode;

    public static String getName() {
        return name;
    }

    public String getBranchID() {
        return branchID;
    }

    public BankBranch setBranchID(String branchID) {
        this.branchID = branchID;
        return this;
    }

    public String getBranchName() {
        return branchName;
    }

    public BankBranch setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    public String getCityCode() {
        return cityCode;
    }

    public BankBranch setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }

    public String getBankCode() {
        return bankCode;
    }

    public BankBranch setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public BankBranch setBranchCode(String branchCode) {
        this.branchCode = branchCode;
        return this;
    }
}
