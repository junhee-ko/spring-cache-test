package me.jko.springcachetest

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TeamServiceTest(
    @Autowired val teamService: TeamService
) {

    @Test
    fun `should call findTeams function only once for same condition`() {
        val searchCondition01 = TeamSearchCondition(rank = 1)
        teamService.findTeams(searchCondition01)    // first call

        val searchCondition02 = TeamSearchCondition(rank = 1)
        teamService.findTeams(searchCondition02)    // second call
    }
}