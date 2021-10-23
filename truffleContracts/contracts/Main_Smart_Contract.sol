//SPDX-License-Identifier: MIT

pragma solidity ^0.8.0;

import "./Company_Smart_Contract.sol";

contract Main_Smart_Contract {
    address[] public walletAddresses;

    mapping(address => address) public walletAddressToSmartContractAddress;

    uint256 value;

    function storeValue(uint256 _value) public {
        value = _value;
    }

    function createSmartContract() public {
        Company_Smart_Contract companyContract = new Company_Smart_Contract(
            msg.sender
        );
        walletAddresses.push(address(companyContract));
        walletAddressToSmartContractAddress[msg.sender] = address(
            companyContract
        );
    }

    function getCompanySmartContractAddress(address _walletAddress)
        public
        view
        returns (address)
    {
        return walletAddressToSmartContractAddress[_walletAddress];
    }

    function addproduct(
        address _ownerAddress,
        address _contractAddress,
        uint256[] memory _products
    ) public returns (string memory) {
        return
            Company_Smart_Contract(_contractAddress).addProducts(
                _ownerAddress,
                _products
            );
    }

    function checkProduct(address _contractAddress, uint256 _productHashCode)
        public
        view
        returns (string memory)
    {
        return
            Company_Smart_Contract(_contractAddress).verifyProduct(
                _productHashCode
            );
    }

    function retrieve(address _val) public pure returns (address) {
        return _val;
    }
}