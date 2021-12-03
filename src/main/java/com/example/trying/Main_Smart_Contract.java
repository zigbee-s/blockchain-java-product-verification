package com.example.trying;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.6.0.
 */
public class Main_Smart_Contract extends Contract {
    private static final String BINARY = "0x608060405234801561001057600080fd5b5061118e806100206000396000f3fe608060405234801561001057600080fd5b50600436106100575760003560e01c80630a79309b1461005c57806325a0f0d01461008c5780633e0920f6146100bc5780634d581a37146100ec5780639b7ff3eb146100f6575b600080fd5b61007660048036038101906100719190610469565b610126565b60405161008391906104a5565b60405180910390f35b6100a660048036038101906100a19190610469565b610130565b6040516100b391906104a5565b60405180910390f35b6100d660048036038101906100d1919061064f565b610199565b6040516100e39190610746565b60405180910390f35b6100f4610236565b005b610110600480360381019061010b9190610768565b610352565b60405161011d9190610746565b60405180910390f35b6000819050919050565b6000600160008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff169050919050565b60608273ffffffffffffffffffffffffffffffffffffffff166320bf63ac85846040518363ffffffff1660e01b81526004016101d6929190610866565b600060405180830381600087803b1580156101f057600080fd5b505af1158015610204573d6000803e3d6000fd5b505050506040513d6000823e3d601f19601f8201168201806040525081019061022d919061093c565b90509392505050565b600033604051610245906103ea565b61024f91906104a5565b604051809103906000f08015801561026b573d6000803e3d6000fd5b5090506000819080600181540180825580915050600190039060005260206000200160009091909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555080600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555050565b60608273ffffffffffffffffffffffffffffffffffffffff1663524e8462836040518263ffffffff1660e01b815260040161038d9190610994565b60006040518083038186803b1580156103a557600080fd5b505afa1580156103b9573d6000803e3d6000fd5b505050506040513d6000823e3d601f19601f820116820180604052508101906103e2919061093c565b905092915050565b6107a9806109b083390190565b6000604051905090565b600080fd5b600080fd5b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b60006104368261040b565b9050919050565b6104468161042b565b811461045157600080fd5b50565b6000813590506104638161043d565b92915050565b60006020828403121561047f5761047e610401565b5b600061048d84828501610454565b91505092915050565b61049f8161042b565b82525050565b60006020820190506104ba6000830184610496565b92915050565b600080fd5b6000601f19601f8301169050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b61050e826104c5565b810181811067ffffffffffffffff8211171561052d5761052c6104d6565b5b80604052505050565b60006105406103f7565b905061054c8282610505565b919050565b600067ffffffffffffffff82111561056c5761056b6104d6565b5b602082029050602081019050919050565b600080fd5b6000819050919050565b61059581610582565b81146105a057600080fd5b50565b6000813590506105b28161058c565b92915050565b60006105cb6105c684610551565b610536565b905080838252602082019050602084028301858111156105ee576105ed61057d565b5b835b81811015610617578061060388826105a3565b8452602084019350506020810190506105f0565b5050509392505050565b600082601f830112610636576106356104c0565b5b81356106468482602086016105b8565b91505092915050565b60008060006060848603121561066857610667610401565b5b600061067686828701610454565b935050602061068786828701610454565b925050604084013567ffffffffffffffff8111156106a8576106a7610406565b5b6106b486828701610621565b9150509250925092565b600081519050919050565b600082825260208201905092915050565b60005b838110156106f85780820151818401526020810190506106dd565b83811115610707576000848401525b50505050565b6000610718826106be565b61072281856106c9565b93506107328185602086016106da565b61073b816104c5565b840191505092915050565b60006020820190508181036000830152610760818461070d565b905092915050565b6000806040838503121561077f5761077e610401565b5b600061078d85828601610454565b925050602061079e858286016105a3565b9150509250929050565b600081519050919050565b600082825260208201905092915050565b6000819050602082019050919050565b6107dd81610582565b82525050565b60006107ef83836107d4565b60208301905092915050565b6000602082019050919050565b6000610813826107a8565b61081d81856107b3565b9350610828836107c4565b8060005b8381101561085957815161084088826107e3565b975061084b836107fb565b92505060018101905061082c565b5085935050505092915050565b600060408201905061087b6000830185610496565b818103602083015261088d8184610808565b90509392505050565b600080fd5b600067ffffffffffffffff8211156108b6576108b56104d6565b5b6108bf826104c5565b9050602081019050919050565b60006108df6108da8461089b565b610536565b9050828152602081018484840111156108fb576108fa610896565b5b6109068482856106da565b509392505050565b600082601f830112610923576109226104c0565b5b81516109338482602086016108cc565b91505092915050565b60006020828403121561095257610951610401565b5b600082015167ffffffffffffffff8111156109705761096f610406565b5b61097c8482850161090e565b91505092915050565b61098e81610582565b82525050565b60006020820190506109a96000830184610985565b9291505056fe608060405234801561001057600080fd5b506040516107a93803806107a9833981810160405281019061003291906100dc565b80600260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555050610109565b600080fd5b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b60006100a98261007e565b9050919050565b6100b98161009e565b81146100c457600080fd5b50565b6000815190506100d6816100b0565b92915050565b6000602082840312156100f2576100f1610079565b5b6000610100848285016100c7565b91505092915050565b610691806101186000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806320bf63ac1461003b578063524e84621461006b575b600080fd5b61005560048036038101906100509190610481565b61009b565b6040516100629190610565565b60405180910390f35b61008560048036038101906100809190610587565b6101dd565b6040516100929190610565565b60405180910390f35b6060600260009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168373ffffffffffffffffffffffffffffffffffffffff16146100f757600080fd5b60005b825181101561019e576000838281518110610118576101176105b4565b5b60200260200101519080600181540180825580915050600190039060005260206000200160009091909190915055600180600085848151811061015e5761015d6105b4565b5b6020026020010151815260200190815260200160002060006101000a81548160ff021916908315150217905550808061019690610612565b9150506100fa565b6040518060400160405280600e81526020017f50726f647563747320616464656400000000000000000000000000000000000081525091505092915050565b60606001600083815260200190815260200160002060009054906101000a900460ff1615610242576040518060400160405280600d81526020017f41757468656e7469636174656400000000000000000000000000000000000000815250905061027b565b6040518060400160405280600b81526020017f436f756e7465726665697400000000000000000000000000000000000000000081525090505b919050565b6000604051905090565b600080fd5b600080fd5b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b60006102bf82610294565b9050919050565b6102cf816102b4565b81146102da57600080fd5b50565b6000813590506102ec816102c6565b92915050565b600080fd5b6000601f19601f8301169050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b610340826102f7565b810181811067ffffffffffffffff8211171561035f5761035e610308565b5b80604052505050565b6000610372610280565b905061037e8282610337565b919050565b600067ffffffffffffffff82111561039e5761039d610308565b5b602082029050602081019050919050565b600080fd5b6000819050919050565b6103c7816103b4565b81146103d257600080fd5b50565b6000813590506103e4816103be565b92915050565b60006103fd6103f884610383565b610368565b905080838252602082019050602084028301858111156104205761041f6103af565b5b835b81811015610449578061043588826103d5565b845260208401935050602081019050610422565b5050509392505050565b600082601f830112610468576104676102f2565b5b81356104788482602086016103ea565b91505092915050565b600080604083850312156104985761049761028a565b5b60006104a6858286016102dd565b925050602083013567ffffffffffffffff8111156104c7576104c661028f565b5b6104d385828601610453565b9150509250929050565b600081519050919050565b600082825260208201905092915050565b60005b838110156105175780820151818401526020810190506104fc565b83811115610526576000848401525b50505050565b6000610537826104dd565b61054181856104e8565b93506105518185602086016104f9565b61055a816102f7565b840191505092915050565b6000602082019050818103600083015261057f818461052c565b905092915050565b60006020828403121561059d5761059c61028a565b5b60006105ab848285016103d5565b91505092915050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b600061061d826103b4565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff8214156106505761064f6105e3565b5b60018201905091905056fea264697066735822122078c26b7d6e52e5ba3bb2a3a26021a433367334f6ffef977d3ac9de10c2635f1d64736f6c63430008090033a26469706673582212201e6767bdcdb755dbf6e7314dd3f102c9228ac959b199693c8be8b80200250f0c64736f6c63430008090033";

    public static final String FUNC_CREATESMARTCONTRACT = "createSmartContract";

    public static final String FUNC_GETCOMPANYSMARTCONTRACTADDRESS = "getCompanySmartContractAddress";

    public static final String FUNC_ADDPRODUCT = "addproduct";

    public static final String FUNC_CHECKPRODUCT = "checkProduct";

    public static final String FUNC_RETRIEVE = "retrieve";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
    }

    @Deprecated
    protected Main_Smart_Contract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Main_Smart_Contract(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Main_Smart_Contract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Main_Smart_Contract(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> createSmartContract() {
        final Function function = new Function(
                FUNC_CREATESMARTCONTRACT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Type> getCompanySmartContractAddress(String _walletAddress) {
        final Function function = new Function(
                FUNC_GETCOMPANYSMARTCONTRACTADDRESS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_walletAddress)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<org.web3j.abi.datatypes.Address>() {}));
		return executeRemoteCallSingleValueReturn(function);
    }

    public RemoteCall<TransactionReceipt> addproduct(String _ownerAddress, String _contractAddress, List<BigInteger> _products) {
        final Function function = new Function(
                FUNC_ADDPRODUCT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_ownerAddress), 
                new org.web3j.abi.datatypes.Address(_contractAddress), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(_products, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> checkProduct(String _contractAddress, BigInteger _productHashCode) {
        final Function function = new Function(
                FUNC_CHECKPRODUCT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_contractAddress), 
                new org.web3j.abi.datatypes.generated.Uint256(_productHashCode)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> retrieve(String _val) {
        final Function function = new Function(
                FUNC_RETRIEVE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_val)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Main_Smart_Contract> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Main_Smart_Contract.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Main_Smart_Contract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Main_Smart_Contract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Main_Smart_Contract> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Main_Smart_Contract.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Main_Smart_Contract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Main_Smart_Contract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static Main_Smart_Contract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Main_Smart_Contract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Main_Smart_Contract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Main_Smart_Contract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Main_Smart_Contract load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Main_Smart_Contract(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Main_Smart_Contract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Main_Smart_Contract(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
