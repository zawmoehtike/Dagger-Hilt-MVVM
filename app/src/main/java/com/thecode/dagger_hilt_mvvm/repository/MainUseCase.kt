package com.thecode.dagger_hilt_mvvm.repository

import com.thecode.dagger_hilt_mvvm.database.BlogDao
import com.thecode.dagger_hilt_mvvm.database.CacheMapper
import com.thecode.dagger_hilt_mvvm.model.Blog
import com.thecode.dagger_hilt_mvvm.network.BlogApi
import com.thecode.dagger_hilt_mvvm.network.BlogMapper
import com.thecode.dagger_hilt_mvvm.util.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MainUseCase @Inject
constructor(
    private val mainRepository: MainRepository
) {
    suspend fun getBlog(): Flow<DataState<List<Blog>>> = mainRepository.getBlog()
}