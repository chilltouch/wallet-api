package wallet.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import wallet.controllers.requests.BalanceRequest
import wallet.entities.Balance
import wallet.controllers.responses.GenericResponse
import wallet.services.WalletService
import java.math.BigDecimal

@RestController
class WalletController @Autowired constructor(private val walletService: WalletService) {

    @GetMapping("/balance")
    fun getBalance(@RequestBody request: BalanceRequest): GenericResponse<Balance, Nothing?> {
        var result: Balance = walletService.getBalance(request.id, request.userId, request.type)
        return GenericResponse(result, null, true)
    }

    @PostMapping("/create")
    fun createBalance(@RequestBody request: BalanceRequest): GenericResponse<Balance, Nothing?> {
        var balance: Balance = walletService.createBalance(request.amount, request.userId, request.type)
        return GenericResponse(balance, null, true)
    }

    @PostMapping("/delete")
    fun deleteBalance(@RequestBody request: BalanceRequest): GenericResponse<Balance, Nothing?> {
        var balance: Balance = walletService.deleteBalance(request.id, request.userId, request.type)
        return GenericResponse(balance, null, true)
    }

    @PostMapping("/deposit")
    fun deposit(@RequestBody request: BalanceRequest): GenericResponse<Balance, Nothing?> {
        var result: Balance = walletService.deposit(request.id, request.amount, request.userId, request.type)
        return GenericResponse(result, null, true)
    }

    @PostMapping("/withdraw")
    fun withdraw(@RequestBody request: BalanceRequest): GenericResponse<Balance, Nothing?> {
        var result: Balance = walletService.withdraw(request.id, request.amount, request.userId, request.type)
        return GenericResponse(result, null, true)
    }
}