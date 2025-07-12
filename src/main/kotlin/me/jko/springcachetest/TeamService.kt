package me.jko.springcachetest

import org.slf4j.LoggerFactory
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

class TeamSearchCondition(
    val rank: Int,
)

data class Team(
    val rank: Int,
    val name: String,
    val location: String
)

@Service
class TeamService {

    private val logger = LoggerFactory.getLogger(javaClass)

    @Cacheable("team", key = "#searchCondition.rank")
    fun findTeams(searchCondition: TeamSearchCondition): List<Team> {
        logger.info("findTeams function called for rank: ${searchCondition.rank}")

        return listOf(
            Team(rank = searchCondition.rank, name = "Thunder", location = "Oklahoma City"),
            Team(rank = searchCondition.rank, name = "Pacers", location = "Indiana"),
        )
    }
}