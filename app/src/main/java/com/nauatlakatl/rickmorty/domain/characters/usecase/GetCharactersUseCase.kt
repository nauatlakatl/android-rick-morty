package com.nauatlakatl.rickmorty.domain.characters.usecase

import com.nauatlakatl.rickmorty.data.characters.remote.dto.CharactersResponse
import com.nauatlakatl.rickmorty.data.common.utils.ResponseListWrapper
import com.nauatlakatl.rickmorty.domain.characters.CharactersRepository
import com.nauatlakatl.rickmorty.domain.characters.entity.CharactersEntity
import com.nauatlakatl.rickmorty.domain.common.BaseResult
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(private val charactersRepository: CharactersRepository) {

    suspend fun execute(): Flow<BaseResult<List<CharactersEntity>, ResponseListWrapper<CharactersResponse>>> {
        return charactersRepository.getAllCharacters()
    }
}