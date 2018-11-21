import { TestBed } from '@angular/core/testing';

import { ApiTestServiceService } from './api-test-service.service';

describe('ApiTestServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ApiTestServiceService = TestBed.get(ApiTestServiceService);
    expect(service).toBeTruthy();
  });
});
